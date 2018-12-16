package cn.hang.manage.mapper;

import cn.hang.manage.po.ThanksPO;
import cn.hang.manage.po.ThanksPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThanksPOMapper {
    long countByExample(ThanksPOExample example);

    int deleteByExample(ThanksPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ThanksPO record);

    int insertSelective(ThanksPO record);

    List<ThanksPO> selectByExample(ThanksPOExample example);

    ThanksPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ThanksPO record, @Param("example") ThanksPOExample example);

    int updateByExample(@Param("record") ThanksPO record, @Param("example") ThanksPOExample example);

    int updateByPrimaryKeySelective(ThanksPO record);

    int updateByPrimaryKey(ThanksPO record);
}