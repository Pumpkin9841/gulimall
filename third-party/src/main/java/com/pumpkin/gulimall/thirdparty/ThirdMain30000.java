package com.pumpkin.gulimall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pumpkin
 * @date 2022/2/13 0013 下午 22:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ThirdMain30000 {
    public static void main(String[] args) {
        SpringApplication.run(ThirdMain30000.class , args) ;
    }
}
