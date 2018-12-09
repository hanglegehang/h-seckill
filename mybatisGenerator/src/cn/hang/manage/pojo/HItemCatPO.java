package cn.hang.manage.pojo;

import java.util.Date;

public class HItemCatPO {
    /**
     * 
     */
    private String id;

    /**
     * -1为根类目，0表示一级目录
     */
    private Long parentId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer order;

    /**
     * 
     */
    private String icon;

    /**
     * 是否可用  0：不可用  1：可用
     */
    private Integer isUsed;

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
     * -1为根类目，0表示一级目录
     * @return parent_id -1为根类目，0表示一级目录
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * -1为根类目，0表示一级目录
     * @param parentId -1为根类目，0表示一级目录
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return order 
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * @param order 
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * @return icon 
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon 
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 是否可用  0：不可用  1：可用
     * @return is_used 是否可用  0：不可用  1：可用
     */
    public Integer getIsUsed() {
        return isUsed;
    }

    /**
     * 是否可用  0：不可用  1：可用
     * @param isUsed 是否可用  0：不可用  1：可用
     */
    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
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
}