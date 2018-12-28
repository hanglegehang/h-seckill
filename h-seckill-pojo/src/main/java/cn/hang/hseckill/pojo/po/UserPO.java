package cn.hang.hseckill.pojo.po;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lihang15
 */
@Data
public class UserPO  implements Serializable {
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
    private String password;

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

    /**
     * 0：不可用  1：可用
     */
    private Integer status;

    /**
     * 是否删除 0：正常 1：已删除
     */
    private Integer isDelete;

    /**
     * 
     */
    private Date gmtCreate;

    /**
     * 
     */
    private Date gmtUpdate;

}