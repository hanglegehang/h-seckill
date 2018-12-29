package cn.hang.front.service.impl;

import cn.hang.front.mapper.ItemPOMapper;
import cn.hang.front.mapper.PanelContentPOMapper;
import cn.hang.front.mapper.PanelPOMapper;
import cn.hang.front.mapper.SeckillItemPOMapper;
import cn.hang.front.service.ItemService;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.pojo.po.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 12:11
 **/
@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

    @Autowired
    private PanelPOMapper panelPOMapper;

    @Autowired
    private PanelContentPOMapper panelContentPOMapper;

    @Autowired
    private ItemPOMapper itemPOMapper;

    @Autowired
    private SeckillItemPOMapper seckillItemPOMapper;

    @Override
    public List<PanelPO> listPanel() {
        PanelPOExample panelPOExample = new PanelPOExample();
        panelPOExample.setOrderByClause("sort_order");
        panelPOExample.createCriteria().andIsDeleteEqualTo(CodeBaseInterface.DeleteEnum.NOT_DELETE.getCode())
                .andStatusEqualTo(CodeBaseInterface.StatusEnum.USED.getCode())
                .andPositionEqualTo(CodeBaseInterface.PanelPositionEnum.INDEX.getCode());
        return panelPOMapper.selectByExample(panelPOExample);
    }

    @Override
    public List<PanelContentPO> listPanelContent(Long panelId) {
        PanelContentPOExample panelContentPOExample = new PanelContentPOExample();
        PanelContentPOExample.Criteria criteria = panelContentPOExample.createCriteria();
        panelContentPOExample.setOrderByClause("sort_order");
        criteria.andPanelIdEqualTo(Integer.valueOf(String.valueOf(panelId)));
        return panelContentPOMapper.selectByExample(panelContentPOExample);
    }


    @Override
    public ItemPO getItemById(Long id) {
        ItemPOExample itemPOExample = new ItemPOExample();
        ItemPOExample.Criteria criteria = itemPOExample.createCriteria();
        criteria.andIsDeleteEqualTo(CodeBaseInterface.DeleteEnum.NOT_DELETE.getCode()).andIdEqualTo(id);
        List<ItemPO> list = itemPOMapper.selectByExample(itemPOExample);
        if (list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public SeckillItemPO getSeckillItemById(Long seckillItemId) {
        return seckillItemPOMapper.selectByPrimaryKey(seckillItemId);
    }
}
