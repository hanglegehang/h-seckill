package cn.hang.hseckill.pojo.po;

import cn.hang.hseckill.pojo.vo.ItemVO;
import lombok.Data;

import java.util.Date;

@Data
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

}