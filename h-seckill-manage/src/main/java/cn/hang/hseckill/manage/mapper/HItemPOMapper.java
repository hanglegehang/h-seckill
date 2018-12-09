package cn.hang.hseckill.manage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HItemPOMapper {


    int deleteByPrimaryKey(String id);

    int insert(HItemPO record);

    int insertSelective(HItemPO record);

    @Select("SELECT * FROM h_item WHERE id = #{id}")
    HItemPO selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(HItemPO record);

    int updateByPrimaryKey(HItemPO record);
}