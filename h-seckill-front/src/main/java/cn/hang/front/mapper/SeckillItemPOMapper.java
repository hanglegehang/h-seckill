package cn.hang.front.mapper;

import cn.hang.hseckill.pojo.po.SeckillItemPO;
import cn.hang.hseckill.pojo.po.SeckillItemPOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeckillItemPOMapper {
    long countByExample(SeckillItemPOExample example);

    int deleteByExample(SeckillItemPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SeckillItemPO record);

    int insertSelective(SeckillItemPO record);

    List<SeckillItemPO> selectByExample(SeckillItemPOExample example);

    SeckillItemPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SeckillItemPO record, @Param("example") SeckillItemPOExample example);

    int updateByExample(@Param("record") SeckillItemPO record, @Param("example") SeckillItemPOExample example);

    int updateByPrimaryKeySelective(SeckillItemPO record);

    int updateByPrimaryKey(SeckillItemPO record);
}