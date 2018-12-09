package cn.hang.manage.mapper;

import cn.hang.manage.pojo.HPermissionPO;
import cn.hang.manage.pojo.HPermissionPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HPermissionPOMapper {
    long countByExample(HPermissionPOExample example);

    int deleteByExample(HPermissionPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(HPermissionPO record);

    int insertSelective(HPermissionPO record);

    List<HPermissionPO> selectByExample(HPermissionPOExample example);

    HPermissionPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HPermissionPO record, @Param("example") HPermissionPOExample example);

    int updateByExample(@Param("record") HPermissionPO record, @Param("example") HPermissionPOExample example);

    int updateByPrimaryKeySelective(HPermissionPO record);

    int updateByPrimaryKey(HPermissionPO record);
}