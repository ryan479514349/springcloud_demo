package com.ruanhao.provider.exception;

import com.ruanhao.provider.enumm.IICResEnum;
import com.ruanhao.provider.model.MessageConvert;

/**
 * @ClassName: IICRuntimeException * @Description: * @author: CHENGYONG928 * @date 2020-2-6 * @version: 1.0
 */
public class IIcRuntimeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -2116971365138188651L;
    private String code;

    public IIcRuntimeException(IICResEnum IICResEnum) {
        super(MessageConvert.getMessage(IICResEnum.getCode()));
        this.code = IICResEnum.getCode();
    }

    public IIcRuntimeException(IICResEnum IICResEnum, Object... arg) {
        super(MessageConvert.getMessage(IICResEnum.getCode(), arg));
        this.code = IICResEnum.getCode();
    }

    public IIcRuntimeException(String code, String message) {
        super(message);
        this.code = code;
    }

    public IIcRuntimeException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }

    public IIcRuntimeException(Exception e) {
        super(e);
    }

    public String getCode() {
        return code;
    }
}