package com.trx.mycat.springbootmycat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trx.mycat.springbootmycat.entity.SysUser;

public interface SysUserService extends IService<SysUser> {

    SysUser findUserByFirstDb(long id);
    SysUser findUserBySecondDb(long id);
}
