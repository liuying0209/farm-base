package com.farm.base.common.enums;


import com.farm.base.common.mybatis.CommonEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 用户状态枚举
 ** @Date: 2018-12-19 17:44
 */
public enum UserStatusEnum implements CommonEnum {

	USABLE(0, "可用");
	final int code;
	final String msg;

	UserStatusEnum(int code, String msg) {
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

	public static UserStatusEnum valueOf(int code) {
		return CommonEnum.valueOf(UserStatusEnum.class, code);
	}

}