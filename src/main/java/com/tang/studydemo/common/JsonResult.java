package com.tang.studydemo.common;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


public class JsonResult {
    private Integer status;
    private int code = 0;
    private Long count;
    private String authToken;
    private String msg;
    private Object data;

    public JsonResult() {
    }

    public JsonResult(Object data) {
        this.data = data;
    }

    public JsonResult(Object data, ResultEmun resultEmun) {
        this.data = data;
        this.status = resultEmun.getCode();
        this.msg = resultEmun.getMessage();
    }

    public JsonResult(ResultEmun resultEmun) {
        this.status = resultEmun.getCode();
        this.msg = resultEmun.getMessage();
    }

    public JsonResult(Object data, Integer code, String msg) {
        this.data = data;
        this.status = code;
        this.msg = msg;
    }

    public JsonResult(String authToken, Object data, ResultEmun resultEmun) {
        this.status = resultEmun.getCode();
        this.authToken = authToken;
        this.msg = resultEmun.getMessage();
        this.data = data;
    }

    public JsonResult(Object data, ResultEmun resultEmun, Long count) {
        this.data = data;
        this.status = resultEmun.getCode();
        this.msg = resultEmun.getMessage();
        this.count = count;
    }

    public static JsonResult success(Object data, String authToken) {
        return new JsonResult(authToken, data, ResultEmun.SUCCESS);
    }

    public static JsonResult unauthorized() {
        return new JsonResult(ResultEmun.UNAUTHORIZED);
    }

    public static JsonResult success(Object data) {
        return new JsonResult(data, ResultEmun.SUCCESS);
    }

    public static JsonResult success() {
        return new JsonResult(ResultEmun.SUCCESS);
    }

    public static JsonResult fail() {
        return new JsonResult(ResultEmun.FAIL);
    }

    public static JsonResult success(Object data, Long count) {
        return new JsonResult(data, ResultEmun.SUCCESS, count);
    }

    public static JsonResult fail(String msg) {
        return new JsonResult((Object) null, ResultEmun.SUCCESS.getCode(), msg);
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String toString() {
        return "JsonResult{status='" + this.status + '\'' + ", code=" + this.code + ", count=" + this.count + ", authToken='" + this.authToken + '\'' + ", msg='" + this.msg + '\'' + ", data=" + this.data + '}';
    }
}

