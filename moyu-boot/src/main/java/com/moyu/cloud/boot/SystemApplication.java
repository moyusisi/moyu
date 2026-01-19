package com.moyu.cloud.boot;

import com.moyu.cloud.common.core.annotation.EnableCommonLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shisong
 * @since 2023-02-21
 */
@EnableCommonLog
//@MapperScan(basePackages = {"com.moyu.boot.**.mapper"})
@SpringBootApplication
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SystemApplication.class);
        application.run(args);
    }
}
