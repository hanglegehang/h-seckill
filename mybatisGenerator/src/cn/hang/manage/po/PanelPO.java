package cn.hang.manage.po;

import java.util.Date;

public class PanelPO {
    /**
     * 类目ID
     */
    private Long id;

    /**
     * 板块名称
     */
    private String name;

    /**
     * 类型 0轮播图 1板块种类一 2板块种类二 3板块种类三 
     */
    private Integer type;

    /**
     * 排列序号
     */
    private Integer sortOrder;

    /**
     * 所属位置 0首页 1商品推荐 2我要捐赠
     */
    private Integer position;

    /**
     * 板块限制商品数量
     */
    private Integer limitNum;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 是否删除 0：正常 1：已删除
     */
    private Integer isDelete;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtUpdate;

    /**
     * 类目ID
     * @return id 类目ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 类目ID
     * @param id 类目ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 板块名称
     * @return name 板块名称
     */
    public String getName() {
        return name;
    }

    /**
     * 板块名称
     * @param name 板块名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 类型 0轮播图 1板块种类一 2板块种类二 3板块种类三 
     * @return type 类型 0轮播图 1板块种类一 2板块种类二 3板块种类三 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型 0轮播图 1板块种类一 2板块种类二 3板块种类三 
     * @param type 类型 0轮播图 1板块种类一 2板块种类二 3板块种类三 
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 排列序号
     * @return sort_order 排列序号
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 排列序号
     * @param sortOrder 排列序号
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 所属位置 0首页 1商品推荐 2我要捐赠
     * @return position 所属位置 0首页 1商品推荐 2我要捐赠
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 所属位置 0首页 1商品推荐 2我要捐赠
     * @param position 所属位置 0首页 1商品推荐 2我要捐赠
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 板块限制商品数量
     * @return limit_num 板块限制商品数量
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * 板块限制商品数量
     * @param limitNum 板块限制商品数量
     */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
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
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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