package com.bjsxt.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot整合MyBatis必要注解
 * @MapperScan - 描述MyBatis提供的Mapper所在包。
 * 注解的配置信息可以通过properties或yml进行配置。
 */
@SpringBootApplication
@MapperScan("com.bjsxt.boot.mapper")
public class AppStarter {

	public static void main(String[] args) {
		SpringApplication.run(AppStarter.class, args);
	}
	
}
