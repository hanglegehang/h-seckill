package cn.hang.hseckill.common.exception;

/**
 * @author lihang15
 * @description
 * @create 2018-12-30 00:35
 **/
public class SessionException extends RuntimeException {

    private String msg;

    public SessionException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
