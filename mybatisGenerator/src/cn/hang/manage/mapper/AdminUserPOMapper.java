package cn.hang.manage.mapper;

import cn.hang.manage.po.AdminUserPO;
import cn.hang.manage.po.AdminUserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserPOMapper {
    long countByExample(AdminUserPOExample example);

    int deleteByExample(AdminUserPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminUserPO record);

    int insertSelective(AdminUserPO record);

    List<AdminUserPO> selectByExample(AdminUserPOExample example);

    AdminUserPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminUserPO record, @Param("example") AdminUserPOExample example);

    int updateByExample(@Param("record") AdminUserPO record, @Param("example") AdminUserPOExample example);

    int updateByPrimaryKeySelective(AdminUserPO record);

    int updateByPrimaryKey(AdminUserPO record);
}