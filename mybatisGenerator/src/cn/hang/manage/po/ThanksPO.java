package cn.hang.manage.po;

import java.math.BigDecimal;
import java.util.Date;

public class ThanksPO {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String nickName;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private BigDecimal money;

    /**
     * 
     */
    private String info;

    /**
     * 通知邮箱
     */
    private String email;

    /**
     * 状态 0待审核 1确认显示  2驳回 3通过不展示
     */
    private Integer state;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 关联订单id
     */
    private Long orderId;

    /**
     * 
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
     * @return nick_name 
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 
     * @param nickName 
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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
     * @return money 
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 
     * @param money 
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 
     * @return info 
     */
    public String getInfo() {
        return info;
    }

    /**
     * 
     * @param info 
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * 通知邮箱
     * @return email 通知邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 通知邮箱
     * @param email 通知邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 状态 0待审核 1确认显示  2驳回 3通过不展示
     * @return state 状态 0待审核 1确认显示  2驳回 3通过不展示
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态 0待审核 1确认显示  2驳回 3通过不展示
     * @param state 状态 0待审核 1确认显示  2驳回 3通过不展示
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 支付方式
     * @return pay_type 支付方式
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 支付方式
     * @param payType 支付方式
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * 关联订单id
     * @return order_id 关联订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 关联订单id
     * @param orderId 关联订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 
     * @return gmt_create 
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 
     * @param gmtCreate 
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