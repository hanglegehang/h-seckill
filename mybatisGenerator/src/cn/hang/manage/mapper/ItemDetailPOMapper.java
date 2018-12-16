package cn.hang.manage.mapper;

import cn.hang.manage.po.ItemDetailPO;
import cn.hang.manage.po.ItemDetailPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemDetailPOMapper {
    long countByExample(ItemDetailPOExample example);

    int deleteByExample(ItemDetailPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemDetailPO record);

    int insertSelective(ItemDetailPO record);

    List<ItemDetailPO> selectByExample(ItemDetailPOExample example);

    ItemDetailPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemDetailPO record, @Param("example") ItemDetailPOExample example);

    int updateByExample(@Param("record") ItemDetailPO record, @Param("example") ItemDetailPOExample example);

    int updateByPrimaryKeySelective(ItemDetailPO record);

    int updateByPrimaryKey(ItemDetailPO record);
}