/*
 * Copyright 2016 htouhui.com All right reserved. This software is the
 * confidential and proprietary information of htouhui.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with htouhui.com.
 */
package com.farm.base.common;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class JsonResult implements Serializable {

    private static final long serialVersionUID = 1752571016357023678L;

    private int status;
    private String message;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static JsonResult ok() {
        return ok(null);
    }

    public static JsonResult ok(Object data) {
        JsonResult result = new JsonResult();
        result.setStatus(200);
        result.setMessage("ok");
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    public static JsonResult failed() {
        return failed("FAILED");
    }

    public static JsonResult failed(String message) {
        JsonResult result = new JsonResult();
        result.setStatus(500);
        result.setMessage(message);
        return result;
    }

    public static JsonResult failed(Integer code, String msg) {
        JsonResult result = new JsonResult();
        result.setStatus(code);
        result.setMessage(msg);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonResult)) {
            return false;
        }
        JsonResult result = (JsonResult) o;
        return status == result.status &&
                Objects.equals(message, result.message) &&
                Objects.equals(data, result.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, data);
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
