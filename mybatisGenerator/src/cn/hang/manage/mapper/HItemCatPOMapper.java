package cn.hang.manage.mapper;

import cn.hang.manage.pojo.HItemCatPO;
import cn.hang.manage.pojo.HItemCatPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HItemCatPOMapper {
    long countByExample(HItemCatPOExample example);

    int deleteByExample(HItemCatPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(HItemCatPO record);

    int insertSelective(HItemCatPO record);

    List<HItemCatPO> selectByExample(HItemCatPOExample example);

    HItemCatPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HItemCatPO record, @Param("example") HItemCatPOExample example);

    int updateByExample(@Param("record") HItemCatPO record, @Param("example") HItemCatPOExample example);

    int updateByPrimaryKeySelective(HItemCatPO record);

    int updateByPrimaryKey(HItemCatPO record);
}