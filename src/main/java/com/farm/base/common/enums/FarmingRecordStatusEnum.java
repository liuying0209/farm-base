package com.farm.base.common.enums;

import com.farm.base.common.mybatis.CommonEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 性别枚举
 *
 ** @Date: 2019-04-20 20:54
 */
public enum FarmingRecordStatusEnum implements CommonEnum{

    NOT_START(0, "未开始"),
    UNFINISHED(1, "未完成"),
    FINISHED(2, "已完成");
    final int code;
    final String msg;

    FarmingRecordStatusEnum(int code, String msg) {
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

    public static FarmingRecordStatusEnum valueOf(int code) {
        return CommonEnum.valueOf(FarmingRecordStatusEnum.class, code);
    }
}
