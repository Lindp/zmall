package com.lindp.zmall.admin.controller;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.lindp.zmall.admin.entity.AdminRole;
import com.lindp.zmall.admin.service.AdminRoleService;
import com.lindp.zmall.common.response.CommonPage;
import com.lindp.zmall.common.response.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 运营角色 前端控制器
 * </p>
 *
 * @author lindp
 * @since 2020-10-28
 */
@RestController
@RequestMapping("/admin/role")
@RequiredArgsConstructor
@Api(tags = "系统角色")
@ApiSupport(author = "lindp")
public class AdminRoleController {
    private final AdminRoleService adminRoleService;

    @GetMapping("/page")
    @ApiOperation(value = "分页查询系统角色")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页码", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", defaultValue = "10"),
            @ApiImplicitParam(name = "roleName", value = "角色名称")
    })
    public CommonResult<CommonPage<AdminRole>> page(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                    @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                    String roleName) {
        Page<AdminRole> page = new Page<>(pageNum, pageSize);
        adminRoleService.page(page, Wrappers.<AdminRole>lambdaQuery()
                .select(AdminRole::getId, AdminRole::getName, AdminRole::getDescription)
                .like(StrUtil.isNotBlank(roleName), AdminRole::getName, roleName)
                .orderByDesc(AdminRole::getCreateTime));
        return CommonResult.success(CommonPage.toPage(page));
    }

    @PostMapping("/save")
    @ApiOperation(value = "保存角色")
    public void save(@RequestBody AdminRole entity) {
        adminRoleService.save(entity);
    }

    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除角色")
    @ApiImplicitParam(name = "id", value = "角色ID", paramType = "path")
    public void delete(@PathVariable("id") Long id) {
        adminRoleService.removeById(id);
    }
}
