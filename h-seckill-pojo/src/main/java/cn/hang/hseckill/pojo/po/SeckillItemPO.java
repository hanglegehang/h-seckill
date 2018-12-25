package cn.hang.hseckill.pojo.po;

import java.util.Date;

public class SeckillItemPO {
    /**
     * 
     */
    private Long id;

    /**
     * 商品id
     */
    private Long itemId;

    /**
     * 商品主图url
     */
    private String itemUrl;

    /**
     * 商品标题
     */
    private String itemTitle;

    /**
     * 商品卖点
     */
    private String itemSellPoint;

    /**
     * 商品价格，单位为分
     */
    private Long itemPrice;

    /**
     * 商品秒杀数量
     */
    private Integer itemSellNum;

    /**
     * 折扣
     */
    private Float discount;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
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
     * 商品主图url
     * @return item_url 商品主图url
     */
    public String getItemUrl() {
        return itemUrl;
    }

    /**
     * 商品主图url
     * @param itemUrl 商品主图url
     */
    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl == null ? null : itemUrl.trim();
    }

    /**
     * 商品标题
     * @return item_title 商品标题
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * 商品标题
     * @param itemTitle 商品标题
     */
    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle == null ? null : itemTitle.trim();
    }

    /**
     * 商品卖点
     * @return item_sell_point 商品卖点
     */
    public String getItemSellPoint() {
        return itemSellPoint;
    }

    /**
     * 商品卖点
     * @param itemSellPoint 商品卖点
     */
    public void setItemSellPoint(String itemSellPoint) {
        this.itemSellPoint = itemSellPoint == null ? null : itemSellPoint.trim();
    }

    /**
     * 商品价格，单位为分
     * @return item_price 商品价格，单位为分
     */
    public Long getItemPrice() {
        return itemPrice;
    }

    /**
     * 商品价格，单位为分
     * @param itemPrice 商品价格，单位为分
     */
    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * 商品秒杀数量
     * @return item_sell_num 商品秒杀数量
     */
    public Integer getItemSellNum() {
        return itemSellNum;
    }

    /**
     * 商品秒杀数量
     * @param itemSellNum 商品秒杀数量
     */
    public void setItemSellNum(Integer itemSellNum) {
        this.itemSellNum = itemSellNum;
    }

    /**
     * 折扣
     * @return discount 折扣
     */
    public Float getDiscount() {
        return discount;
    }

    /**
     * 折扣
     * @param discount 折扣
     */
    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    /**
     * 开始时间
     * @return start_time 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 开始时间
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 结束时间
     * @return end_time 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 结束时间
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 
     * @return status 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return is_delete 
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 
     * @param isDelete 
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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
     * 更新时间
     * @return gmt_update 更新时间
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * 更新时间
     * @param gmtUpdate 更新时间
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}