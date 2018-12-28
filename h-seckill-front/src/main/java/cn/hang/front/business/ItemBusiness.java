package cn.hang.front.business;

import cn.hang.hseckill.pojo.vo.ItemVO;
import cn.hang.hseckill.pojo.vo.PanelVO;

import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 13:48
 **/
public interface ItemBusiness {

    /**
     * 根据id获取商品详情
     *
     * @param id
     * @return
     */
    ItemVO getItemVOById(Long id);

    /**
     * 获取商城首页信息
     *
     * @return
     */
    List<PanelVO> getHomeInfo();
}
