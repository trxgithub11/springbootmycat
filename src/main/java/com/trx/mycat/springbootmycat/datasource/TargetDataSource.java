package com.trx.mycat.springbootmycat.datasource;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    String name() default "";
}
