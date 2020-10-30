package com.lindp.zmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis 配置
 *
 * @author lindp
 * @date 2020/10/29
 */
@Configuration
@MapperScan("com.lindp.zmall.**.dao")
public class MyBatisConfig {
}
