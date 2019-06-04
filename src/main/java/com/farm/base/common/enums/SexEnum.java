package com.farm.base.common.enums;

import com.farm.base.common.mybatis.CommonEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 性别枚举
 *
 ** @Date: 2019-04-20 20:54
 */
public enum SexEnum  implements CommonEnum{


    NONE(0, "未知"), MAN(1, "男"),WOMAN(2, "女");
    final int code;
    final String msg;

    SexEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    @JsonValue
    public String getMsg() {
        return msg;
    }

    public static SexEnum valueOf(int code) {
        return CommonEnum.valueOf(SexEnum.class, code);
    }
}
