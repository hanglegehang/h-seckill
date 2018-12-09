package cn.hang.manage.mapper;

import cn.hang.manage.pojo.HItemPO;
import cn.hang.manage.pojo.HItemPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HItemPOMapper {
    long countByExample(HItemPOExample example);

    int deleteByExample(HItemPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(HItemPO record);

    int insertSelective(HItemPO record);

    List<HItemPO> selectByExample(HItemPOExample example);

    HItemPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HItemPO record, @Param("example") HItemPOExample example);

    int updateByExample(@Param("record") HItemPO record, @Param("example") HItemPOExample example);

    int updateByPrimaryKeySelective(HItemPO record);

    int updateByPrimaryKey(HItemPO record);
}