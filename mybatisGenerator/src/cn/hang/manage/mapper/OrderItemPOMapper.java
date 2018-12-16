package cn.hang.manage.mapper;

import cn.hang.manage.po.OrderItemPO;
import cn.hang.manage.po.OrderItemPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemPOMapper {
    long countByExample(OrderItemPOExample example);

    int deleteByExample(OrderItemPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderItemPO record);

    int insertSelective(OrderItemPO record);

    List<OrderItemPO> selectByExample(OrderItemPOExample example);

    OrderItemPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderItemPO record, @Param("example") OrderItemPOExample example);

    int updateByExample(@Param("record") OrderItemPO record, @Param("example") OrderItemPOExample example);

    int updateByPrimaryKeySelective(OrderItemPO record);

    int updateByPrimaryKey(OrderItemPO record);
}