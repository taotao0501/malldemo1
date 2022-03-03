package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mapper.PmsBrandMapper;
import com.macro.mall.tiny.common.model.PmsBrand;
import com.macro.mall.tiny.model.PmsBrandDO;
import com.macro.mall.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Bentao She
 * @Email: harrypotterandsbt@gmail.com
 * @Date: 2022/3/2 17:10
 * @Version: V1.0
 **/

@Service
public class PmsBrandServivceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrandDO> listAllBrand() {
        return brandMapper.selectByExample();
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

//    @Override
//    public int updateBrand(Long id, PmsBrand brand) {
//        brand.setId(id);
//        return brandMapper.updateByPrimaryKeySelective(brand);
//    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

//    @Override
//    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum, pageSize);
//        return brandMapper.selectByExample();
//    }
//
//    @Override
//    public PmsBrand getBrand(Long id) {
//        return brandMapper.selectByPrimaryKey(id);
//    }
}
