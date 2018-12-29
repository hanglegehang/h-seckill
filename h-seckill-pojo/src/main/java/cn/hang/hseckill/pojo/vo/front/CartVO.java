package cn.hang.hseckill.pojo.vo.front;

import lombok.Data;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 11:44
 **/
@Data
public class CartVO {
    private Long itemId;

    private String price;

    private String itemName;

    private String itemImg;

    private Integer buyNum;

    private String checked;
}
