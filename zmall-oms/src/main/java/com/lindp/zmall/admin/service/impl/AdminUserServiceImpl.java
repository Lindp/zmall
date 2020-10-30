package com.lindp.zmall.admin.service.impl;

import com.lindp.zmall.admin.entity.AdminUser;
import com.lindp.zmall.admin.dao.AdminUserDao;
import com.lindp.zmall.admin.service.AdminUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 运营用户 服务实现类
 * </p>
 *
 * @author lindp
 * @since 2020-10-28
 */
@Service
public class AdminUserServiceImpl extends ServiceImpl<AdminUserDao, AdminUser> implements AdminUserService {

}
