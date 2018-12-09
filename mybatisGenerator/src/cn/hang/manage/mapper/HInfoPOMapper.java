package cn.hang.manage.mapper;

import cn.hang.manage.pojo.HInfoPO;
import cn.hang.manage.pojo.HInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HInfoPOMapper {
    long countByExample(HInfoPOExample example);

    int deleteByExample(HInfoPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(HInfoPO record);

    int insertSelective(HInfoPO record);

    List<HInfoPO> selectByExample(HInfoPOExample example);

    HInfoPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HInfoPO record, @Param("example") HInfoPOExample example);

    int updateByExample(@Param("record") HInfoPO record, @Param("example") HInfoPOExample example);

    int updateByPrimaryKeySelective(HInfoPO record);

    int updateByPrimaryKey(HInfoPO record);
}