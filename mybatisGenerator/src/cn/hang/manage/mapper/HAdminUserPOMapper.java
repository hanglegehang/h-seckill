package cn.hang.manage.mapper;

import cn.hang.manage.pojo.HAdminUserPO;
import cn.hang.manage.pojo.HAdminUserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HAdminUserPOMapper {
    long countByExample(HAdminUserPOExample example);

    int deleteByExample(HAdminUserPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(HAdminUserPO record);

    int insertSelective(HAdminUserPO record);

    List<HAdminUserPO> selectByExample(HAdminUserPOExample example);

    HAdminUserPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HAdminUserPO record, @Param("example") HAdminUserPOExample example);

    int updateByExample(@Param("record") HAdminUserPO record, @Param("example") HAdminUserPOExample example);

    int updateByPrimaryKeySelective(HAdminUserPO record);

    int updateByPrimaryKey(HAdminUserPO record);
}