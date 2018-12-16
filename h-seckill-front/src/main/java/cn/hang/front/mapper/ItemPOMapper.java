package cn.hang.front.mapper;


import java.util.List;

import cn.hang.hseckill.pojo.po.ItemPO;
import cn.hang.hseckill.pojo.po.ItemPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItemPOMapper {
    long countByExample(ItemPOExample example);

    int deleteByExample(ItemPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemPO record);

    int insertSelective(ItemPO record);

    List<ItemPO> selectByExample(ItemPOExample example);

    @Select("SELECT * FROM h_item WHERE id = #{id}")
    ItemPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemPO record, @Param("example") ItemPOExample example);

    int updateByExample(@Param("record") ItemPO record, @Param("example") ItemPOExample example);

    int updateByPrimaryKeySelective(ItemPO record);

    int updateByPrimaryKey(ItemPO record);
}