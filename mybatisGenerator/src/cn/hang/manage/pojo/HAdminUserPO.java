package cn.hang.manage.pojo;

import java.util.Date;

public class HAdminUserPO {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String email;

    /**
     * 0：未知 1：男 2：女
     */
    private Integer sex;

    /**
     * 头像url
     */
    private String avatarUrl;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 
     */
    private Integer roleId;

    /**
     * 0：正常 1:锁定
     */
    private Integer status;

    /**
     * 是否删除 0：正常 1：已删除 
     */
    private Integer isDeleted;

    /**
     * 最后登陆IP
     */
    private String loginIp;

    /**
     * 最后登录时间
     */
    private Date loginDate;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 
     */
    private Date gmtUpdate;

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
     * 盐
     * @return salt 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 盐
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
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
     * 0：未知 1：男 2：女
     * @return sex 0：未知 1：男 2：女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 0：未知 1：男 2：女
     * @param sex 0：未知 1：男 2：女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 头像url
     * @return avatar_url 头像url
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 头像url
     * @param avatarUrl 头像url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * 描述信息
     * @return description 描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述信息
     * @param description 描述信息
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 
     * @return role_id 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 0：正常 1:锁定
     * @return status 0：正常 1:锁定
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0：正常 1:锁定
     * @param status 0：正常 1:锁定
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 是否删除 0：正常 1：已删除 
     * @return is_deleted 是否删除 0：正常 1：已删除 
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除 0：正常 1：已删除 
     * @param isDeleted 是否删除 0：正常 1：已删除 
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 最后登陆IP
     * @return login_ip 最后登陆IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 最后登陆IP
     * @param loginIp 最后登陆IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 最后登录时间
     * @return login_date 最后登录时间
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * 最后登录时间
     * @param loginDate 最后登录时间
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 创建时间
     * @return gmt_create 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 
     * @return gmt_update 
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * 
     * @param gmtUpdate 
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}