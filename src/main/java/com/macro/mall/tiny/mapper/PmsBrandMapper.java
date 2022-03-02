package com.macro.mall.tiny.mapper;

import com.macro.mall.tiny.common.model.PmsBrand;
import com.macro.mall.tiny.common.model.PmsBrandExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PmsBrandMapper {

    int deleteByPrimaryKey(Long id);

    int insertSelective(PmsBrand record);

    List<PmsBrand> selectByExample();

//    PmsBrand selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(PmsBrand record);

}