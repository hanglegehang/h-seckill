package cn.hang.front.business;

import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.vo.AddressVO;
import cn.hang.hseckill.pojo.vo.CartVO;
import cn.hang.hseckill.pojo.vo.ItemVO;
import cn.hang.hseckill.pojo.vo.PanelVO;

import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-28 13:48
 **/
public interface CartBusiness {

    Response add(List<CartVO> cartVOList, Long useId);


    Response<List<CartVO>> list(Long useId);


    Response delete(Long useId, Long[] itemId);
}
