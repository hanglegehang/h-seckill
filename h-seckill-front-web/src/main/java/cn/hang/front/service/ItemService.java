package cn.hang.front.service;

import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.ItemPO;

/**
 * @author lihang15
 */
public interface ItemService {
    /**
     * 获取首页信息
     *
     * @return
     */
    Response getHomeInfo();

    /**
     * getItemById
     *
     * @param id
     * @return
     */
    Response<ItemPO> getItemById(Long id);

}
