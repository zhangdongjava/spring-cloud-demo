package com.zzz.scd.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZZZGitConfigApplication {

    public static void main(String[] args) {
        System.out.println("服务器性能优化第一步完成!");
        System.out.println("服务器性能优化第二步完成!");
        System.out.println("服务器性能优化最后一步完成!");
        SpringApplication.run(ZZZGitConfigApplication.class);
    }
}
