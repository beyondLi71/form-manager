package com.beyondli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.beyondli.mapper")
public class K2WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(K2WebApplication.class, args);
	}
}
