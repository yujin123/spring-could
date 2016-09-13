package com.yujin.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 *
 * @author yujin
 * @email yujin7@staff.sina.com.cn
 * @create 2016-09-13 12:39
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${spring.datasource.username}")
    private String username;

    @RequestMapping("/hello")
    public String hello(){
        System.err.println("------------"+username);
        return username;
    }
}
