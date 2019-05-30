/*
 * Copyright 2016 htouhui.com All right reserved. This software is the
 * confidential and proprietary information of htouhui.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with htouhui.com.
 */
package com.farm.base;


public class BaseException extends Exception {

    public static final int ERROR_CODE_ILLEGAL_ARGUMENTS = 600;
    public static final int ERROR_CODE_MISSING_TOKEN = 601;
    public static final int ERROR_CODE_NO_AUTHENTICATED = 602;

    private static final long serialVersionUID = 8761186321644895071L;

    private int code;
    private String errorMessage;

    public BaseException(int code) {
        super("error code " + code);
        this.code = code;
    }

    public BaseException(int code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public BaseException(int code, String errorMessage) {
        super(errorMessage);
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
