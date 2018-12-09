package cn.hang.manage.pojo;

import java.util.Date;

public class HItemPO {
    /**
     * 
     */
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 价格【单位为分】
     */
    private Long price;

    /**
     * 折扣
     */
    private Float discount;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 图片url
     */
    private String imageUrl;

    /**
     * 商品状态 0：正常 -1：下架 1：删除
     */
    private Integer status;

    /**
     * 商品类目id
     */
    private Long itemCatId;

    /**
     * 是否删除 0：正常 1：已删除
     */
    private Integer isDeleted;

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
     */
    private Integer e;

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
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 价格【单位为分】
     * @return price 价格【单位为分】
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 价格【单位为分】
     * @param price 价格【单位为分】
     */
    public void setPrice(Long price) {
        this.price = price;
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
     * 库存
     * @return stock 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 库存
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 图片url
     * @return image_url 图片url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 图片url
     * @param imageUrl 图片url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * 商品状态 0：正常 -1：下架 1：删除
     * @return status 商品状态 0：正常 -1：下架 1：删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 商品状态 0：正常 -1：下架 1：删除
     * @param status 商品状态 0：正常 -1：下架 1：删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 商品类目id
     * @return item_cat_id 商品类目id
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * 商品类目id
     * @param itemCatId 商品类目id
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
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

    /**
     * 
     * @return  e/ 
     */
    public Integer getE() {
        return e;
    }

    /**
     * 
     * @param e 
     */
    public void setE(Integer e) {
        this.e = e;
    }
}