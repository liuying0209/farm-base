package com.farm.base.exception;

import com.farm.base.BaseException;

/**
 ** @Date: 2019-04-21 12:13
 */
public class UploadException extends BaseException {

    public static final int FILE_IS_ERROE = 950;
    public static final int FILENAME_IS_ERROE = 951;
    public static final int NO_FILE_IN_OSS = 952;


    public UploadException(int code) {
        super(code);
    }

    public UploadException(int code, Throwable throwable) {
        super(code, throwable);
    }

    public UploadException(int code, String errorMessage) {
        super(code, errorMessage);
    }
}
