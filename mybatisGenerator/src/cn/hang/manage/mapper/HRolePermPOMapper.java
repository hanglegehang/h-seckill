package cn.hang.manage.mapper;

import cn.hang.manage.pojo.HRolePermPO;
import cn.hang.manage.pojo.HRolePermPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HRolePermPOMapper {
    long countByExample(HRolePermPOExample example);

    int deleteByExample(HRolePermPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(HRolePermPO record);

    int insertSelective(HRolePermPO record);

    List<HRolePermPO> selectByExample(HRolePermPOExample example);

    HRolePermPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HRolePermPO record, @Param("example") HRolePermPOExample example);

    int updateByExample(@Param("record") HRolePermPO record, @Param("example") HRolePermPOExample example);

    int updateByPrimaryKeySelective(HRolePermPO record);

    int updateByPrimaryKey(HRolePermPO record);
}