package com.macro.mall.tiny.mapper;

import com.macro.mall.tiny.common.model.PmsBrand;
import com.macro.mall.tiny.common.model.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsBrandMapper {

    int deleteByPrimaryKey(Long id);

    int insertSelective(PmsBrand record);

    List<PmsBrand> selectByExample(PmsBrandExample example);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

}