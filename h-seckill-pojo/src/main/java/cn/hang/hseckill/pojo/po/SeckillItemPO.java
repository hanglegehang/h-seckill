package cn.hang.hseckill.pojo.po;

import lombok.Data;

import java.util.Date;

/**
 * @author lihang15
 */
@Data
public class SeckillItemPO {
    /**
     * 
     */
    private Long id;

    /**
     * 商品id
     */
    private Long itemId;

    /**
     * 商品主图url
     */
    private String itemUrl;

    /**
     * 商品标题
     */
    private String itemTitle;

    /**
     * 商品卖点
     */
    private String itemSellPoint;

    /**
     * 商品价格，单位为分
     */
    private Long itemPrice;

    /**
     * 商品秒杀数量
     */
    private Integer itemSellNum;

    /**
     * 
     */
    private Integer itemSellLimit;

    /**
     * 已售出数量
     */
    private Integer itemSoldNum;

    /**
     * 折扣
     */
    private Float discount;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtUpdate;

}