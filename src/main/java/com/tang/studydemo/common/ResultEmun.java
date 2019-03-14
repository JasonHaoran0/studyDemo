package com.tang.studydemo.common;

public enum ResultEmun {
    SUCCESS(200, "操作成功"),
    FAIL(500, "操作失败"),
    UNAUTHORIZED(401, "校验token失败或者token已过期,请重新登录");

    private Integer code;
    private String message;

    private ResultEmun(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
