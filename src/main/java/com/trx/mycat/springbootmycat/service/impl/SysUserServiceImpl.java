package com.trx.mycat.springbootmycat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trx.mycat.springbootmycat.datasource.DataSourceNames;
import com.trx.mycat.springbootmycat.datasource.TargetDataSource;
import com.trx.mycat.springbootmycat.entity.SysUser;
import com.trx.mycat.springbootmycat.mapper.SysUserMapper;
import com.trx.mycat.springbootmycat.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {


    @Override
    public SysUser findUserByFirstDb(long id) {
        return this.baseMapper.selectById(id);
    }

    @TargetDataSource(name= DataSourceNames.SECOND)
    @Override
    public SysUser findUserBySecondDb(long id) {
        return this.findUserByFirstDb(id);
    }
}
