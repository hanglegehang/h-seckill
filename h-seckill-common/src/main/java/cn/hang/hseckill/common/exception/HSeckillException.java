package cn.hang.hseckill.common.exception;

/**
 * @author lihang15
 * @description
 * @create 2018-12-05 18:05
 **/
public class HSeckillException extends RuntimeException {
    private String msg;

    public HSeckillException(String msg) {
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
