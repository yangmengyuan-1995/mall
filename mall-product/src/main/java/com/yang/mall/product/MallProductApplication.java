package com.yang.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 1、整合MyBatis-Plus
* 	1) 导入依赖
*    <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.2.0</version>
     </dependency>
*	2) 配置
*   	1、配置数据源
* 			1) 导入数据库的驱动。
* 			2) 在application.yml配置数据源相关信息
* 		2、配置MyBatis-Plus
* 			1) 使用@MapperScan
* 			2）告诉MyBatis-Plus, sql映射文件位置
*
*
*
* */
@MapperScan("com.yang.mall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class, args);
	}

}
