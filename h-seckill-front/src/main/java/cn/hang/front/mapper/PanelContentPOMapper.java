package cn.hang.front.mapper;

import java.util.List;

import cn.hang.hseckill.pojo.po.PanelContentPO;
import cn.hang.hseckill.pojo.po.PanelContentPOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PanelContentPOMapper {
    long countByExample(PanelContentPOExample example);

    int deleteByExample(PanelContentPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PanelContentPO record);

    int insertSelective(PanelContentPO record);

    List<PanelContentPO> selectByExample(PanelContentPOExample example);

    PanelContentPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PanelContentPO record, @Param("example") PanelContentPOExample example);

    int updateByExample(@Param("record") PanelContentPO record, @Param("example") PanelContentPOExample example);

    int updateByPrimaryKeySelective(PanelContentPO record);

    int updateByPrimaryKey(PanelContentPO record);
}