package cn.hang.hseckill.pojo.po;

import java.io.Serializable;

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
    private Integer gmtCreate;

    /**
     * 
     */
    private Integer gmtUpdate;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return username 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 
     * @return password 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 
     * @return phone 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone 
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 
     * @return email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 1：男 2：女  0：未知
     * @return sex 1：男 2：女  0：未知
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 1：男 2：女  0：未知
     * @param sex 1：男 2：女  0：未知
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 
     * @return description 
     */
    public Integer getDescription() {
        return description;
    }

    /**
     * 
     * @param description 
     */
    public void setDescription(Integer description) {
        this.description = description;
    }

    /**
     * 余额，单位为分
     * @return balance 余额，单位为分
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * 余额，单位为分
     * @param balance 余额，单位为分
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * 头像
     * @return avatar 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 头像
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 0：不可用  1：可用
     * @return status 0：不可用  1：可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0：不可用  1：可用
     * @param status 0：不可用  1：可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 是否删除 0：正常 1：已删除
     * @return is_delete 是否删除 0：正常 1：已删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除 0：正常 1：已删除
     * @param isDelete 是否删除 0：正常 1：已删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 
     * @return gmt_create 
     */
    public Integer getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 
     * @param gmtCreate 
     */
    public void setGmtCreate(Integer gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 
     * @return gmt_update 
     */
    public Integer getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * 
     * @param gmtUpdate 
     */
    public void setGmtUpdate(Integer gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}