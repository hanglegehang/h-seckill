package cn.hang.manage.mapper;

import cn.hang.manage.po.InfoPO;
import cn.hang.manage.po.InfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoPOMapper {
    long countByExample(InfoPOExample example);

    int deleteByExample(InfoPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InfoPO record);

    int insertSelective(InfoPO record);

    List<InfoPO> selectByExample(InfoPOExample example);

    InfoPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InfoPO record, @Param("example") InfoPOExample example);

    int updateByExample(@Param("record") InfoPO record, @Param("example") InfoPOExample example);

    int updateByPrimaryKeySelective(InfoPO record);

    int updateByPrimaryKey(InfoPO record);
}