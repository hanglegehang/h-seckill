package cn.hang.front.mapper;

import cn.hang.hseckill.pojo.po.ItemPO;
import cn.hang.hseckill.pojo.po.ItemPOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemPOMapper {
    long countByExample(ItemPOExample example);

    int deleteByExample(ItemPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemPO record);

    int insertSelective(ItemPO record);

    List<ItemPO> selectByExample(ItemPOExample example);

    ItemPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemPO record, @Param("example") ItemPOExample example);

    int updateByExample(@Param("record") ItemPO record, @Param("example") ItemPOExample example);

    int updateByPrimaryKeySelective(ItemPO record);

    int updateByPrimaryKey(ItemPO record);
}