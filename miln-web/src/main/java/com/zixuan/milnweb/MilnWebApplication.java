package com.zixuan.milnweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"com.zixuan.dao","com.zixuan.service","com.zixuan"})
@MapperScan("com.zixuan.dao")
public class MilnWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilnWebApplication.class, args);
	}

}
