package cn.hang.manage.mapper;

import cn.hang.manage.po.RolePermPO;
import cn.hang.manage.po.RolePermPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermPOMapper {
    long countByExample(RolePermPOExample example);

    int deleteByExample(RolePermPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RolePermPO record);

    int insertSelective(RolePermPO record);

    List<RolePermPO> selectByExample(RolePermPOExample example);

    RolePermPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RolePermPO record, @Param("example") RolePermPOExample example);

    int updateByExample(@Param("record") RolePermPO record, @Param("example") RolePermPOExample example);

    int updateByPrimaryKeySelective(RolePermPO record);

    int updateByPrimaryKey(RolePermPO record);
}