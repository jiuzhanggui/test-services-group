package com.loveapp.test.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * ServiceApplication
 *
 * @author aiyong@aiyong.cn
 * @date 2022-03-15 15:10
 */
@EnableCaching
@SpringBootApplication(scanBasePackages = {"com.loveapp.test"})
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
