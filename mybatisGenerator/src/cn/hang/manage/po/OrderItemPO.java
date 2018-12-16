package cn.hang.manage.po;

import java.util.Date;

public class OrderItemPO {
    /**
     * 
     */
    private Long id;

    /**
     * 商品id
     */
    private Long itemId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 商品购买数量
     */
    private Integer num;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品单价，单位为分
     */
    private Long price;

    /**
     * 商品总金额，单位为分
     */
    private Long totalFee;

    /**
     * 商品图片地址
     */
    private String picPath;

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
     * 商品id
     * @return item_id 商品id
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 商品id
     * @param itemId 商品id
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 订单id
     * @return order_id 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 商品购买数量
     * @return num 商品购买数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 商品购买数量
     * @param num 商品购买数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 商品标题
     * @return title 商品标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 商品标题
     * @param title 商品标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 商品单价，单位为分
     * @return price 商品单价，单位为分
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 商品单价，单位为分
     * @param price 商品单价，单位为分
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 商品总金额，单位为分
     * @return total_fee 商品总金额，单位为分
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * 商品总金额，单位为分
     * @param totalFee 商品总金额，单位为分
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 商品图片地址
     * @return pic_path 商品图片地址
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 商品图片地址
     * @param picPath 商品图片地址
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
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