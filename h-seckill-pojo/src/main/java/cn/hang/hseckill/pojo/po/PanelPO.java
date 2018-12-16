package cn.hang.hseckill.pojo.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
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

    private List<PanelContentPO> panelContents;

    public String toString() {
        return "PanelPO(id=" + this.getId() + ", name=" + this.getName() + ", type=" + this.getType() + ", sortOrder=" + this.getSortOrder() + ", position=" + this.getPosition() + ", limitNum=" + this.getLimitNum() + ", status=" + this.getStatus() + ", isDelete=" + this.getIsDelete() + ", remark=" + this.getRemark() + ", gmtCreate=" + this.getGmtCreate() + ", gmtUpdate=" + this.getGmtUpdate() + ", panelContents=" + this.getPanelContents() + ")";
    }
}