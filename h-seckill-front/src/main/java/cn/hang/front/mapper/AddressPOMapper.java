package cn.hang.front.mapper;

import cn.hang.hseckill.pojo.po.AddressPO;
import cn.hang.hseckill.pojo.po.AddressPOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddressPOMapper {
    long countByExample(AddressPOExample example);

    int deleteByExample(AddressPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AddressPO record);

    int insertSelective(AddressPO record);

    List<AddressPO> selectByExample(AddressPOExample example);

    AddressPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AddressPO record, @Param("example") AddressPOExample example);

    int updateByExample(@Param("record") AddressPO record, @Param("example") AddressPOExample example);

    int updateByPrimaryKeySelective(AddressPO record);

    int updateByPrimaryKey(AddressPO record);

    List<Long> listIdByUserId(Long userId);

    int batchDeleteByIdList(List<Long> addressIdList);

    int batchUpdateDefaultByIdList(List<Long> addressIdList);
}