package com.ruanhao.provider.model;

import com.ruanhao.provider.enumm.IICResEnum;
import com.ruanhao.provider.exception.IIcRuntimeException;
import com.ruanhao.provider.util.GsonUtils;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Qualifier("IICResponseModel")
public class IICResponseModel<T> implements Serializable {
    private static final long serialVersionUID = -6648392240679437593L;
    /**
     * 请求ID
     */
    private String requestId = MDC.get("requestId");
    /**
     * 返回码
     */
    private String responseCode;
    /**
     * 响应消息
     */
    private String responseMessage;
    /**
     * 自定义数据返回
     */
    private T data;

    public static <T> IICResponseModel<T> success(T data) {
        IICResponseModel<T> response = new IICResponseModel<>();
        response.setResponseCode(IICResEnum.SUCCESS.getCode());
        response.setResponseMessage(MessageConvert.getMessage(IICResEnum.SUCCESS.getMsg()));
        response.setData(data);
        return response;
    }

    public static <T> IICResponseModel<T> error(IICResEnum res) {
        res = res == null ? IICResEnum.FAILED : res;
        String message = MessageConvert.getMessage(res.getCode());
        return error(res.getCode(), message, null);
    }

    public static <T> IICResponseModel<T> error(IIcRuntimeException ex) {
        IICResEnum res = IICResEnum.getEnum(ex.getCode());
        String message = ex.getMessage();
        if (null == res) {
            res = IICResEnum.FAILED;
            message = MessageConvert.getMessage(res.getCode());
        }
        return error(res.getCode(), message, null);
    }

    public static <T> IICResponseModel<T> error(IICResEnum res, T data) {
        res = res == null ? IICResEnum.FAILED : res;
        String message = MessageConvert.getMessage(res.getCode());
        return error(res.getCode(), message, data);
    }

    public static IICResponseModel<String> FieldError(IICResEnum paramError, String field) {
        IICResponseModel<String> response = new IICResponseModel<>();
        response.setResponseCode(paramError.getCode());
        response.setResponseMessage(MessageConvert.getMessage(paramError.getCode()));
        response.setData("[" + field + "] " + MessageConvert.getMessage(IICResEnum.FIELD_VALIDATE_FAIL.getCode()));
        return response;
    }

    /**
     * 声明为 private， 屏蔽外部调用 * * @return
     */
    private static <T> IICResponseModel<T> error(String code, String message, T data) {
        IICResponseModel<T> response = new IICResponseModel<>();
        response.setResponseCode(code);
        response.setResponseMessage(message);
        response.setData(data);
        return response;
    }

    @Override
    public String toString() {
        return GsonUtils.GsonString(this);
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getRequestId() {
        return requestId;
    }
}