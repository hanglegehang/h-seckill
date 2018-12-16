package cn.hang.manage.mapper;

import cn.hang.manage.po.RolePO;
import cn.hang.manage.po.RolePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePOMapper {
    long countByExample(RolePOExample example);

    int deleteByExample(RolePOExample example);

    int deleteByPrimaryKey(String id);

    int insert(RolePO record);

    int insertSelective(RolePO record);

    List<RolePO> selectByExample(RolePOExample example);

    RolePO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RolePO record, @Param("example") RolePOExample example);

    int updateByExample(@Param("record") RolePO record, @Param("example") RolePOExample example);

    int updateByPrimaryKeySelective(RolePO record);

    int updateByPrimaryKey(RolePO record);
}