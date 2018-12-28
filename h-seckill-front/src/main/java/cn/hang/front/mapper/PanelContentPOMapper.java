package cn.hang.front.mapper;

import cn.hang.hseckill.pojo.po.PanelContentPO;
import cn.hang.hseckill.pojo.po.PanelContentPOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
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