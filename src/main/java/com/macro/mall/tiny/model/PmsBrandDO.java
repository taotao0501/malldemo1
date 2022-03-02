package com.macro.mall.tiny.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @Description: pms_brand表 DO类
 * @Author: Bentao She
 * @Email: harrypotterandsbt@gmail.com
 * @Date: 2022/3/2 17:52
 * @Version: V1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsBrandDO {

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "首字母")
    private String firstLetter;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    @ApiModelProperty(value = "展示状态：0->；1->")
    private Integer showStatus;

    @ApiModelProperty(value = "产品数量")
    private Integer productCount;

    @ApiModelProperty(value = "产品评论")
    private Integer productCommentCount;

    @ApiModelProperty(value = "品牌标志")
    private String logo;

    @ApiModelProperty(value = "大图地址")
    private String bigPic;

    @ApiModelProperty(value = "故事")
    private String brandStory;

}
