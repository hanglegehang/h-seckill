package cn.hang.hseckill.common.pojo;


import cn.hang.hseckill.common.constant.ResponseMessageEnum;

import java.io.Serializable;

/**
 * @author lihang15
 * @description
 * @create 2018-11-27 19:38
 **/
public class Response<T> implements Serializable {
    private int code;
    private String message;
    private T data;


    public Response() {
    }

    private Response(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    private Response(ResponseMessageInterface msg) {
        this.code = msg.getCode();
        this.message = msg.getMessage();
    }

    private Response(ResponseMessageInterface msg, T data) {
        this.code = msg.getCode();
        this.message = msg.getMessage();
        this.data = data;
    }

    public static <T> Response<T> success() {
        return new Response<T>(ResponseMessageEnum.SUCCESS);
    }

    public static <T> Response<T> success(T body) {
        return new Response<T>(ResponseMessageEnum.SUCCESS, body);
    }

    public static <T> Response<T> error() {
        return new Response<T>(ResponseMessageEnum.ERROR);
    }

    public static <T> Response<T> error(String msg) {
        return new Response<T>(ResponseMessageEnum.ERROR.getCode(), msg);
    }

    public static <T> Response<T> error(ResponseMessageInterface msg, T data) {
        return new Response<T>(msg, data);
    }

    public static <T> Response<T> error(ResponseMessageInterface msg) {
        return new Response<T>(msg);
    }

    @Override
    public String toString() {
        return "Response(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}


