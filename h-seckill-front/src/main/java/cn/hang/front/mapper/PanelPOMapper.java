package cn.hang.front.mapper;

import cn.hang.hseckill.pojo.po.PanelPO;
import cn.hang.hseckill.pojo.po.PanelPOExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PanelPOMapper {
    long countByExample(PanelPOExample example);

    int deleteByExample(PanelPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PanelPO record);

    int insertSelective(PanelPO record);

    List<PanelPO> selectByExample(PanelPOExample example);

    PanelPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PanelPO record, @Param("example") PanelPOExample example);

    int updateByExample(@Param("record") PanelPO record, @Param("example") PanelPOExample example);

    int updateByPrimaryKeySelective(PanelPO record);

    int updateByPrimaryKey(PanelPO record);
}