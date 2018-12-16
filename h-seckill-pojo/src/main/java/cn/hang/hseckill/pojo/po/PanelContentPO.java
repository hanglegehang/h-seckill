package cn.hang.hseckill.pojo.po;

import java.util.Date;

public class PanelContentPO {
    /**
     * 
     */
    private Long id;

    /**
     * 所属板块id
     */
    private Integer panelId;

    /**
     * 类型 0关联商品 1其他链接
     */
    private Integer type;

    /**
     * 关联商品id
     */
    private Long productId;

    /**
     * 
     */
    private Integer sortOrder;

    /**
     * 其他链接
     */
    private String fullUrl;

    /**
     * 
     */
    private String picUrl;

    /**
     * 3d轮播图备用
     */
    private String picUrl2;

    /**
     * 3d轮播图备用
     */
    private String picUrl3;

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
     * 所属板块id
     * @return panel_id 所属板块id
     */
    public Integer getPanelId() {
        return panelId;
    }

    /**
     * 所属板块id
     * @param panelId 所属板块id
     */
    public void setPanelId(Integer panelId) {
        this.panelId = panelId;
    }

    /**
     * 类型 0关联商品 1其他链接
     * @return type 类型 0关联商品 1其他链接
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型 0关联商品 1其他链接
     * @param type 类型 0关联商品 1其他链接
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 关联商品id
     * @return product_id 关联商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 关联商品id
     * @param productId 关联商品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return sort_order 
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 
     * @param sortOrder 
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 其他链接
     * @return full_url 其他链接
     */
    public String getFullUrl() {
        return fullUrl;
    }

    /**
     * 其他链接
     * @param fullUrl 其他链接
     */
    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl == null ? null : fullUrl.trim();
    }

    /**
     * 
     * @return pic_url 
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 
     * @param picUrl 
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * 3d轮播图备用
     * @return pic_url2 3d轮播图备用
     */
    public String getPicUrl2() {
        return picUrl2;
    }

    /**
     * 3d轮播图备用
     * @param picUrl2 3d轮播图备用
     */
    public void setPicUrl2(String picUrl2) {
        this.picUrl2 = picUrl2 == null ? null : picUrl2.trim();
    }

    /**
     * 3d轮播图备用
     * @return pic_url3 3d轮播图备用
     */
    public String getPicUrl3() {
        return picUrl3;
    }

    /**
     * 3d轮播图备用
     * @param picUrl3 3d轮播图备用
     */
    public void setPicUrl3(String picUrl3) {
        this.picUrl3 = picUrl3 == null ? null : picUrl3.trim();
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