package cn.hang.manage.pojo;

import java.util.Date;

public class HPermissionPO {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String url;

    /**
     * 更新者id
     */
    private Long updateBy;

    /**
     * 创建者id
     */
    private Long createBy;

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
     * @return url 
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 更新者id
     * @return update_by 更新者id
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新者id
     * @param updateBy 更新者id
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 创建者id
     * @return create_by 创建者id
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 创建者id
     * @param createBy 创建者id
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
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