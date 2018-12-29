package cn.hang.hseckill.pojo.vo.front;

import lombok.Data;

import java.util.List;
/**
 * @author lihang15
 */
@Data
public class PanelVO {

    private List<PanelContentVO> panelContents;

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
     * 所属位置 0首页 1商品推荐 2我要捐赠
     */
    private Integer position;

    /**
     * 板块限制商品数量
     */
    private Integer limitNum;

}