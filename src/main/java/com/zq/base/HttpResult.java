package com.zq.base;

import com.zq.enums.ExceptionTypeEnum;
import lombok.Data;

@Data
public class HttpResult<T> {

    private boolean status;

    private String message;

    private Integer errorType;

    private T data;

    public HttpResult() {

    }

    public HttpResult(boolean status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public HttpResult(boolean status, String message, Integer errorType, T data) {
        this.status = status;
        this.message = message;
        this.errorType = errorType;
        this.data = data;
    }

    public static <T> HttpResult<T> success() {
        return new HttpResult<>(true, null, null);
    }

    public static <T> HttpResult<T> success(T data) {
        return new HttpResult<>(true, null, data);
    }

    public static <T> HttpResult<T> success(String message) {
        return new HttpResult<>(true, message, null);
    }


    public static <T> HttpResult<T> success(T data, String message) {
        return new HttpResult<>(true, message, data);
    }

    public static <T> HttpResult<T> error(String message) {
        return new HttpResult<>(false, message, ExceptionTypeEnum.BIZ_EXCEPTION.getType(), null);
    }

    public static <T> HttpResult<T> error(int errorType, String message) {
        return new HttpResult<>(false, message, errorType, null);
    }
}
