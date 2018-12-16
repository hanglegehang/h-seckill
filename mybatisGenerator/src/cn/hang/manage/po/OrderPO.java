package cn.hang.manage.po;

import java.util.Date;

public class OrderPO {
    /**
     * 订单id
     */
    private Long id;

    /**
     * 实付金额，单位为分
     */
    private Long payment;

    /**
     * 支付类型 1在线支付 2货到付款
     */
    private Integer paymentType;

    /**
     * 邮费，单位为分
     */
    private Long postFee;

    /**
     * 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     */
    private Integer status;

    /**
     * 付款时间
     */
    private Date paymentTime;

    /**
     * 发货时间
     */
    private Date consignTime;

    /**
     * 交易完成时间
     */
    private Date endTime;

    /**
     * 交易关闭时间
     */
    private Date closeTime;

    /**
     * 物流名称
     */
    private String shippingName;

    /**
     * 物流单号
     */
    private String shippingCode;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 买家留言
     */
    private String buyerMessage;

    /**
     * 买家昵称
     */
    private String buyerNick;

    /**
     * 买家是否已经评价
     */
    private Boolean buyerComment;

    /**
     * 
     */
    private Date gmtCreate;

    /**
     * 
     */
    private Date gmtUpdate;

    /**
     * 订单id
     * @return id 订单id
     */
    public Long getId() {
        return id;
    }

    /**
     * 订单id
     * @param id 订单id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 实付金额，单位为分
     * @return payment 实付金额，单位为分
     */
    public Long getPayment() {
        return payment;
    }

    /**
     * 实付金额，单位为分
     * @param payment 实付金额，单位为分
     */
    public void setPayment(Long payment) {
        this.payment = payment;
    }

    /**
     * 支付类型 1在线支付 2货到付款
     * @return payment_type 支付类型 1在线支付 2货到付款
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * 支付类型 1在线支付 2货到付款
     * @param paymentType 支付类型 1在线支付 2货到付款
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 邮费，单位为分
     * @return post_fee 邮费，单位为分
     */
    public Long getPostFee() {
        return postFee;
    }

    /**
     * 邮费，单位为分
     * @param postFee 邮费，单位为分
     */
    public void setPostFee(Long postFee) {
        this.postFee = postFee;
    }

    /**
     * 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     * @return status 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     * @param status 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 付款时间
     * @return payment_time 付款时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 付款时间
     * @param paymentTime 付款时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 发货时间
     * @return consign_time 发货时间
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * 发货时间
     * @param consignTime 发货时间
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * 交易完成时间
     * @return end_time 交易完成时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 交易完成时间
     * @param endTime 交易完成时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 交易关闭时间
     * @return close_time 交易关闭时间
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 交易关闭时间
     * @param closeTime 交易关闭时间
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 物流名称
     * @return shipping_name 物流名称
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * 物流名称
     * @param shippingName 物流名称
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    /**
     * 物流单号
     * @return shipping_code 物流单号
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * 物流单号
     * @param shippingCode 物流单号
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 买家留言
     * @return buyer_message 买家留言
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * 买家留言
     * @param buyerMessage 买家留言
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    /**
     * 买家昵称
     * @return buyer_nick 买家昵称
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * 买家昵称
     * @param buyerNick 买家昵称
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * 买家是否已经评价
     * @return buyer_comment 买家是否已经评价
     */
    public Boolean getBuyerComment() {
        return buyerComment;
    }

    /**
     * 买家是否已经评价
     * @param buyerComment 买家是否已经评价
     */
    public void setBuyerComment(Boolean buyerComment) {
        this.buyerComment = buyerComment;
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