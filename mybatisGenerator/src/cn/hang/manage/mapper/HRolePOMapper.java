package cn.hang.manage.mapper;

import cn.hang.manage.pojo.HRolePO;
import cn.hang.manage.pojo.HRolePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HRolePOMapper {
    long countByExample(HRolePOExample example);

    int deleteByExample(HRolePOExample example);

    int deleteByPrimaryKey(String id);

    int insert(HRolePO record);

    int insertSelective(HRolePO record);

    List<HRolePO> selectByExample(HRolePOExample example);

    HRolePO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HRolePO record, @Param("example") HRolePOExample example);

    int updateByExample(@Param("record") HRolePO record, @Param("example") HRolePOExample example);

    int updateByPrimaryKeySelective(HRolePO record);

    int updateByPrimaryKey(HRolePO record);
}