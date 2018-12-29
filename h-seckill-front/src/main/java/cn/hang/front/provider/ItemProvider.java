package cn.hang.front.provider;

import cn.hang.front.business.ItemBusiness;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.vo.front.ItemVO;
import cn.hang.hseckill.pojo.vo.front.PanelVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lihang15
 * @description
 * @create 2018-12-04 19:01
 **/
@Slf4j
@RestController
@RequestMapping("/item")
public class ItemProvider {

    @Autowired
    private ItemBusiness itemBusiness;

    @RequestMapping("/home")
    public Response home() {
        List<PanelVO> list = itemBusiness.getHomeInfo();
        return Response.success(list);
    }

    /**
     * 获取商品id
     *
     * @return
     */
    @GetMapping("/{id}")
    Response<ItemVO> getItemById(@PathVariable("id") Long id) {
        ItemVO itemVO = itemBusiness.getItemVOById(id);
        if (itemVO != null) {
            return Response.success(itemVO);
        } else {
            return Response.error();
        }
    }


}
