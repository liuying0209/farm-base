package com.farm.base.common.enums;

import com.farm.base.common.mybatis.CommonEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 面积单位枚举
 *
 ** @Date: 2019-04-20 20:54
 */
public enum UnitEnum implements CommonEnum{


    MU(0, "亩"), M(1, "平方米");
    final int code;
    final String msg;

    UnitEnum(int code, String msg) {
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

    public static UnitEnum valueOf(int code) {
        return CommonEnum.valueOf(UnitEnum.class, code);
    }
}
