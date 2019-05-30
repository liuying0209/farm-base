package com.farm.base.common.enums;

import com.farm.base.common.mybatis.CommonEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 归类枚举
 *
 ** @Date: 2019-04-20 20:54
 */
public enum CategoryEnum implements CommonEnum {

    ONE(0, "直接拍摄"),
    TWO(1, "前置任务"),
    THREE(2, "细分子任务");
    final int code;
    final String msg;

    CategoryEnum(int code, String msg) {
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

    public static CategoryEnum valueOf(int code) {
        return CommonEnum.valueOf(CategoryEnum.class, code);
    }
}
