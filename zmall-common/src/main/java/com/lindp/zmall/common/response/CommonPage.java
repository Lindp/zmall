package com.lindp.zmall.common.response;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lindp.zmall.common.utils.JsonUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * Common Page 对象
 *
 * @author lindp
 * @date 2020/9/24
 */
@Data
@Accessors(chain = true)
public class CommonPage<T> implements Serializable {
    @ApiModelProperty(value = "当前页码")
    private Long pageNum;
    @ApiModelProperty(value = "每页条数")
    private Long pageSize;
    @ApiModelProperty(value = "总页数")
    private Long totalPage;
    @ApiModelProperty(value = "总条数")
    private Long total;
    @ApiModelProperty(value = "分页数据")
    private List<T> records;

    public static <T> CommonPage<T> toPage(Page<T> page) {
        CommonPage<T> commonPage = new CommonPage<T>();
        commonPage.setTotalPage(page.getPages());
        commonPage.setPageNum(page.getCurrent());
        commonPage.setPageSize(page.getSize());
        commonPage.setTotal(page.getTotal());
        commonPage.setRecords(page.getRecords());
        return commonPage;
    }

    public String toJson() {
        return JsonUtil.obj2String(this);
    }
}
