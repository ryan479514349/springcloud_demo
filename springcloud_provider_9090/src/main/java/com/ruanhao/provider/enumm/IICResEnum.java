package com.ruanhao.provider.enumm;

import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
public enum IICResEnum {
    SUCCESS("E00000000", "成功"), FAILED("E00000001", "系统繁忙，请稍后再试"), PARAM_ERROR("E00000002", "参数错误"), FIELD_VALIDATE_FAIL("E00000003", "校验失败"), REMOTE_SERVICE_FAIL("E00000004", "远程调用失败"), MOBILE_NO_ERR("E01000001", "该手机号码有误，请重新输入"), MOBILE_NO_EXISTS("E01000002", "该手机号码已存在"), SMS_OTP_INPUT_ERR("E01000003", "短信验证码输入错误，请重新输入"), SMS_OTP_SEND_ERR("E01000004", "短信验证码获取失败"), VALIDATED_GESTURE_FAIL("E01000005", "手势密码错误，您还可输入{0}次"), SSO_TICKET_INVALID("E01000006", "请重新登录"), USER_NOT_EXISTS("E01000007", "{0}用户不存在"), ADMIN_USER_STATUS_ERR("E01000008", "当前用户状态异常，请与总管理员联系"), ELITE_RECOMMEND_ERR("E01000009", "最多推荐{0}条记录，请先取消已推荐记录，再推荐新记录"), AGENT_STICKY_ERR("E01000010", "最多置顶{0}条记录，请先取消已置顶记录，再置顶新记录"), MOBILE_NO_REGISTERED("E01000011", "该手机号码已注册"),
    ;
    private String code;
    private String msg;

    IICResEnum(String code, String msg) {
        this.code = code;
        this.code = code;
        this.msg = msg;
    }

    public static IICResEnum getEnum(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (IICResEnum iie : IICResEnum.values()) {
            if (iie.getCode().equals(code)) {
                return iie;
            }
        }
        return null;
    }
}