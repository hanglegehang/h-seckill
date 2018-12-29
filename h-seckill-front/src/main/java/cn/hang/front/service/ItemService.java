package cn.hang.front.service;

import cn.hang.hseckill.pojo.po.ItemPO;
import cn.hang.hseckill.pojo.po.PanelContentPO;
import cn.hang.hseckill.pojo.po.PanelPO;
import cn.hang.hseckill.pojo.po.SeckillItemPO;

import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 12:11
 **/
public interface ItemService {

    List<PanelPO> listPanel();

    List<PanelContentPO> listPanelContent(Long panelId);

    /**
     * 根据商品id获取商品信息
     *
     * @param id
     * @return
     */
    ItemPO getItemById(Long id);


    SeckillItemPO getSeckillItemById(Long seckillItemId);
}
