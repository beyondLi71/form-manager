package com.beyondli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.beyondli.mapper")
public class AspWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspWebApplication.class, args);
	}
}
