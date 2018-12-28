package cn.hang.hseckill.pojo.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 23:02
 **/
@Data
public class UserVO {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String phone;

    /**
     *
     */
    private String email;

    /**
     * 1：男 2：女  0：未知
     */
    private Integer sex;

    /**
     *
     */
    private Integer description;

    /**
     * 余额，单位为分
     */
    private Long balance;

    /**
     * 头像
     */
    private String avatar;
}
