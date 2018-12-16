package cn.hang.manage.mapper;

import cn.hang.manage.po.ItemCatPO;
import cn.hang.manage.po.ItemCatPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemCatPOMapper {
    long countByExample(ItemCatPOExample example);

    int deleteByExample(ItemCatPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemCatPO record);

    int insertSelective(ItemCatPO record);

    List<ItemCatPO> selectByExample(ItemCatPOExample example);

    ItemCatPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemCatPO record, @Param("example") ItemCatPOExample example);

    int updateByExample(@Param("record") ItemCatPO record, @Param("example") ItemCatPOExample example);

    int updateByPrimaryKeySelective(ItemCatPO record);

    int updateByPrimaryKey(ItemCatPO record);
}