package cn.hang.hseckill.common.constant;


import cn.hang.hseckill.common.pojo.ResponseMessageInterface;

/**
 * @author lihang15
 * @description
 * @create 2018-11-27 19:38
 **/
public enum ResponseMessageEnum implements ResponseMessageInterface {
    /**
     * 成功
     */
    SUCCESS(200, "操作成功"),
    NOT_FOUND(404, "没有查询结果"),
    NO_COMPETENCE(401, "未登录"),
    ACCOUNT_NOT_EXIST(402, "账户不存在"),
    ERROR(500, "操作失败"),
    NETWORK_ERROR(501, "服务器开小差了")
    ;

    private int code;
    private String message;

    ResponseMessageEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
