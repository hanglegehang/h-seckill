package cn.hang.hseckill.pojo.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lihang15
 */
@ToString
@Setter
@Getter
public class ItemPO implements Serializable {

    private SeckillItemPO seckillItemPO;
    /**
     *
     */
    private Long id;

    /**
     * 商品类目id
     */
    private Long itemCatId;

    /**
     * 标题
     */
    private String title;

    /**
     *
     */
    private String sellPoint;

    /**
     * 价格【单位为分】
     */
    private Long price;

    /**
     * 折扣
     */
    private Float discount;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 图片url
     */
    private String imageUrl;

    /**
     * 商品状态 0：正常 -1：下架 1：删除
     */
    private Integer status;

    /**
     * 1：秒杀商品 0：非秒杀商品
     */
    private Integer isSeckill;

    /**
     * 秒杀商品详情ID
     */
    private Long seckillItemId;

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
}