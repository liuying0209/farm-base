package com.farm.base.common.enums;

import com.farm.base.common.mybatis.CommonEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 地块类别
 *
 ** @Date: 2019-04-20 20:54
 */
public enum PlotTypeEnum implements CommonEnum{


    BROODER(0, "暖"), COOL(1, "冷");
    final int code;
    final String msg;

    PlotTypeEnum(int code, String msg) {
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

    public static PlotTypeEnum valueOf(int code) {
        return CommonEnum.valueOf(PlotTypeEnum.class, code);
    }
}
