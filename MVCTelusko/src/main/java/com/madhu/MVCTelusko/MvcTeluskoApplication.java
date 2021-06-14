package com.madhu.MVCTelusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.madhu.MVCTelusko.Controller")
public class MvcTeluskoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcTeluskoApplication.class, args);
	}

}
