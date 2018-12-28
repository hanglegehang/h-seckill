package cn.hang.hseckill.pojo.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 15:10
 **/
@Data
public class PanelContentVO {
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
     * 关联商品
     */
    private ItemVO itemVO;

    /**
     * 其他链接
     */
    private String fullUrl;

    /**
     *
     */
    private String picUrl;


}
