package com.farm.base.common.enums;

import com.farm.base.common.mybatis.CommonEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 性别枚举
 *
 ** @Date: 2019-04-20 20:54
 */
public enum DeductMarksTypeEnum implements CommonEnum {


    IMPEACH(0, "存疑图片"),
    CHEATING(1, "严重作弊行为"),
    NO(2, "无"),
    ADD(3, "加分");
    final int code;
    final String msg;

    DeductMarksTypeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    @JsonValue
    public int getCode() {
        return code;
    }

    @Override

    public String getMsg() {
        return msg;
    }

    public static DeductMarksTypeEnum valueOf(int code) {
        return CommonEnum.valueOf(DeductMarksTypeEnum.class, code);
    }
}
