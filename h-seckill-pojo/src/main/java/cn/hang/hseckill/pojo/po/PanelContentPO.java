package cn.hang.hseckill.pojo.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class PanelContentPO {

    private ItemPO itemPO;

    private SeckillItemPO seckillItemPO;

    private Integer isSeckillItem;
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