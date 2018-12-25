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
    private Long itemId;

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
     * @return item_id 关联商品id
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 关联商品id
     * @param itemId 关联商品id
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
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