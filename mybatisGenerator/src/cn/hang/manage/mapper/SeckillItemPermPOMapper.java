package cn.hang.manage.mapper;

import cn.hang.manage.po.SeckillItemPermPO;
import cn.hang.manage.po.SeckillItemPermPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeckillItemPermPOMapper {
    long countByExample(SeckillItemPermPOExample example);

    int deleteByExample(SeckillItemPermPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SeckillItemPermPO record);

    int insertSelective(SeckillItemPermPO record);

    List<SeckillItemPermPO> selectByExample(SeckillItemPermPOExample example);

    SeckillItemPermPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SeckillItemPermPO record, @Param("example") SeckillItemPermPOExample example);

    int updateByExample(@Param("record") SeckillItemPermPO record, @Param("example") SeckillItemPermPOExample example);

    int updateByPrimaryKeySelective(SeckillItemPermPO record);

    int updateByPrimaryKey(SeckillItemPermPO record);
}