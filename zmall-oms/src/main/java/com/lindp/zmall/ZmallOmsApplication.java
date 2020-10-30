package com.lindp.zmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 应用启动入口类
 *
 * @author lindp
 * @date 2020/10/28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZmallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmallOmsApplication.class, args);
    }
}
