package cn.hang.hseckill.pojo.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author lihang15
 * @description 商品VO
 * @create 2018-12-28 12:22
 **/
@Data
public class ItemVO {
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

    private Integer itemSellLimit;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 是否为秒杀商品
     */
    private Integer isSeckill;


}
