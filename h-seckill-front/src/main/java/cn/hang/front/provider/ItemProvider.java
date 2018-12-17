package cn.hang.front.provider;

import cn.hang.front.mapper.PanelContentPOMapper;
import cn.hang.front.mapper.PanelPOMapper;
import cn.hang.hseckill.common.constant.CodeBaseInterface;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.PanelContentPO;
import cn.hang.hseckill.pojo.po.PanelContentPOExample;
import cn.hang.hseckill.pojo.po.PanelPO;
import cn.hang.hseckill.pojo.po.PanelPOExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    private PanelPOMapper panelPOMapper;

    @Autowired
    private PanelContentPOMapper panelContentPOMapper;

    @RequestMapping("/home")
    public Response home() {
        PanelPOExample panelPOExample = new PanelPOExample();
        panelPOExample.setOrderByClause("sort_order");
        panelPOExample.createCriteria().andIsDeleteEqualTo(CodeBaseInterface.DeleteEnum.NOT_DELETE.getCode())
                .andStatusEqualTo(CodeBaseInterface.StatusEnum.USED.getCode())
                .andPositionEqualTo(CodeBaseInterface.PanelPositionEnum.INDEX.getCode());
        List<PanelPO> list = panelPOMapper.selectByExample(panelPOExample);
        for (PanelPO panelPO : list) {
            PanelContentPOExample panelContentPOExample = new PanelContentPOExample();
            PanelContentPOExample.Criteria criteria = panelContentPOExample.createCriteria();
            panelContentPOExample.setOrderByClause("sort_order");
            criteria.andPanelIdEqualTo(Integer.valueOf(String.valueOf(panelPO.getId())));
            List<PanelContentPO> panelContentPOList = panelContentPOMapper.selectByExample(panelContentPOExample);
            panelPO.setPanelContents(panelContentPOList);
        }
        return Response.success(list);
    }
}
