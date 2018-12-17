package cn.hang.hseckill.common.pojo;


import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author lihang15
 * @description
 * @create 2018-11-27 19:38
 **/
@Getter
@Setter
@ToString
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
}


