package cn.hang.manage.mapper;

import cn.hang.manage.po.PermissionPO;
import cn.hang.manage.po.PermissionPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionPOMapper {
    long countByExample(PermissionPOExample example);

    int deleteByExample(PermissionPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionPO record);

    int insertSelective(PermissionPO record);

    List<PermissionPO> selectByExample(PermissionPOExample example);

    PermissionPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionPO record, @Param("example") PermissionPOExample example);

    int updateByExample(@Param("record") PermissionPO record, @Param("example") PermissionPOExample example);

    int updateByPrimaryKeySelective(PermissionPO record);

    int updateByPrimaryKey(PermissionPO record);
}