package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.model.PmsBrand;
import com.macro.mall.tiny.model.PmsBrandDO;

import java.util.List;

/**
 * @Description:
 * @Author: Bentao She
 * @Date: 2022/3/2 17:09
 * @Version: V1.0
 **/

public interface PmsBrandService {

    List<PmsBrandDO> listAllBrand();

    int createBrand(PmsBrand brand);

//    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

//    List<PmsBrand> listBrand(int pageNum, int pageSize);
//
//    PmsBrand getBrand(Long id);
}
