package com.macro.mall.tiny.mapper;

import com.macro.mall.tiny.common.model.PmsBrand;
import java.util.List;

import com.macro.mall.tiny.model.PmsBrandDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PmsBrandMapper {

    int deleteByPrimaryKey(Long id);

    int insertSelective(PmsBrand record);

    List<PmsBrandDO> selectByExample();

//    PmsBrand selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(PmsBrand record);

}