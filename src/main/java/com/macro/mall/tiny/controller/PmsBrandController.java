package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.CommonPage;
import com.macro.mall.tiny.common.CommonResult;
import com.macro.mall.tiny.common.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 品牌管理Controller
 * @Author: Bentao She
 * @Email: harrypotterandsbt@gmail.com
 * @Date: 2022/3/2 9:55
 * @Version: V1.0
 **/

@Api(tags = "品牌管理")
@RestController
@RequestMapping("/brand")
public class PmsBrandController {

    @Autowired
    private PmsBrandService demoService;

    /**
     * IDE控制台打印日志：标记日志信息所在类
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @GetMapping(value = "/listAll")
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(demoService.listAllBrand());
    }

    @PostMapping(value = "/create")
    public CommonResult createBrand(@RequestBody PmsBrand pmsBrand) {
        CommonResult commonResult;
        int count = demoService.createBrand(pmsBrand);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrand);
            LOGGER.debug("createBrand success:{}", pmsBrand);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", pmsBrand);
        }
        return commonResult;
    }

//    @PostMapping(value = "/update/{id}")
//    public CommonResult updateBrand(@PathVariable("id") Long id, @RequestBody PmsBrand pmsBrandDto, BindingResult result) {
//        CommonResult commonResult;
//        int count = demoService.updateBrand(id, pmsBrandDto);
//        if (count == 1) {
//            commonResult = CommonResult.success(pmsBrandDto);
//            LOGGER.debug("updateBrand success:{}", pmsBrandDto);
//        } else {
//            commonResult = CommonResult.failed("操作失败");
//            LOGGER.debug("updateBrand failed:{}", pmsBrandDto);
//        }
//        return commonResult;
//    }

    @GetMapping(value = "/delete/{id}")
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = demoService.deleteBrand(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

//    @GetMapping(value = "/list")
//    @ResponseBody
//    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
//                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
//        List<PmsBrand> brandList = demoService.listBrand(pageNum, pageSize);
//        return CommonResult.success(CommonPage.restPage(brandList));
//    }
//
//    @GetMapping(value = "/{id}")
//    @ResponseBody
//    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
//        return CommonResult.success(demoService.getBrand(id));
//    }

}
