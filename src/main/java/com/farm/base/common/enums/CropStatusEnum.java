package com.farm.base.common.enums;

import com.farm.base.common.mybatis.CommonEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 作物状态
 *
 ** @Date: 2019-04-20 20:54
 */
public enum CropStatusEnum implements CommonEnum{

    DOING(0, "种植中"),
    NODOING(1, "未开始"),
    FINISHED(2, "已终止");
    final int code;
    final String msg;

    CropStatusEnum(int code, String msg) {
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

    public static CropStatusEnum valueOf(int code) {
        return CommonEnum.valueOf(CropStatusEnum.class, code);
    }
}
