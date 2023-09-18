package com.yang.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
*  1、 如何使用Nacos作为配置中心
*   1) 引入依赖
*       <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
            <version>2.1.0.RELEASE</version>
        </dependency>
*   2) 创建一个bootstrap.properties
*       spring.application.name=mall-coupon
*       spring.cloud.nacos.config.server-addr=127.0.0.1:8848
*   3) 需要给配置中心默认添加一个数据集mall-coupon.properties。默认规则: 应用名.properties
*   4) 给应用名.properties 添加配置
*   5) 动态获取配置
*       @RefreshScope: 动态刷新并获取配置
*       @Value("${配置项的名}"): 获取到配置
*       如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置
*
*   2、细节
*       1) 命名空间: 配置隔离
*       2) 配置集
*       3) 配置集ID
*
* */
@MapperScan("com.yang.mall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
