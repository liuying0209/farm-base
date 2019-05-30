package com.farm.base.exception;

import com.farm.base.BaseException;

/**
 ** @Date: 2019-04-21 12:13
 */
public class FarmException extends BaseException {

    public static final int CROP_INFO_ERROR = 850;
    public static final int PLOT_INFO_ERROR = 851;
    public static final int FARM_WORK_INFO_ERROR = 852;
    public static final int CROP_TASK_INFO_ERROR = 853;
    public static final int FARMING_RECORD_INFO_ERROR = 854;
    public static final int PLOT_CROP_INFO_ERROR = 855;
    public static final int TEMPLATE_INFO_ERROR = 856;
    public static final int FARM_INFO_ERROR = 857;

    public static final int THE_RECORD_ASSESS_ERROR = 860;

    public FarmException(int code) {
        super(code);
    }

    public FarmException(int code, Throwable throwable) {
        super(code, throwable);
    }

    public FarmException(int code, String errorMessage) {
        super(code, errorMessage);
    }
}
