package com.yujin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 分布式文件服务启动类
 *
 * @author yujin
 * @email yujin7@staff.sina.com.cn
 * @create 2016-09-12 19:42
 */
@SpringBootApplication
@EnableConfigServer
public class Applciation {

    /**
     * 启动类
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(Applciation.class).web(true).run(args);
    }
}
