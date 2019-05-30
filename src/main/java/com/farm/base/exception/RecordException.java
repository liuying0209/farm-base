package com.farm.base.exception;

import com.farm.base.BaseException;

/**
 ** @Date: 2019-04-21 12:13
 */
public class RecordException extends BaseException {

    public static final int PLOT_CROP_INFO_ERROR = 900;


    public RecordException(int code) {
        super(code);
    }

    public RecordException(int code, Throwable throwable) {
        super(code, throwable);
    }

    public RecordException(int code, String errorMessage) {
        super(code, errorMessage);
    }
}
