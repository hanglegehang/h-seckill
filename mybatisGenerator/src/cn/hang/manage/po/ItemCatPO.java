package cn.hang.manage.po;

import java.util.Date;

public class ItemCatPO {
    /**
     * 
     */
    private Long id;

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
     *  0：不可用  1：可用
     */
    private Integer status;

    /**
     * 是否删除 0：正常 1：已删除
     */
    private Integer isDelete;

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
     *  0：不可用  1：可用
     * @return status  0：不可用  1：可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *  0：不可用  1：可用
     * @param status  0：不可用  1：可用
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