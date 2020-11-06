package com.trx.mycat.springbootmycat;

import com.trx.mycat.springbootmycat.datasource.DataSourceAspect;
import com.trx.mycat.springbootmycat.entity.SysUser;
import com.trx.mycat.springbootmycat.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMycatApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

    @Autowired
    private SysUserService userService;

    @Test
    public void contextLoads() {
        SysUser user = userService.getById(1);
        logger.info(user.toString());
    }

    @Test
    public void test() {
        // localhost:3306/ds0
        SysUser user = userService.findUserByFirstDb(1);
        logger.info("第一个数据库 : [{}]", user.toString());
        // localhost:3306/ds1
        SysUser user2 = userService.findUserBySecondDb(2);
        logger.info("第二个数据库 : [{}]", user2.toString());
    }

}
