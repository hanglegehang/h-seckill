package cn.hang.manage.pojo;

import java.util.Date;

public class HInfoPO {
    /**
     * 
     */
    private String id;

    /**
     * 站点名称
     */
    private String siteName;

    /**
     * 
     */
    private String keyWord;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Integer isDefault;

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
     * 站点名称
     * @return site_name 站点名称
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * 站点名称
     * @param siteName 站点名称
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * 
     * @return key_word 
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * 
     * @param keyWord 
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    /**
     * 
     * @return description 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 
     * @return is_default 
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 
     * @param isDefault 
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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