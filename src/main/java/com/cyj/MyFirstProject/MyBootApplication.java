package com.cyj.MyFirstProject;

import java.util.concurrent.ExecutionException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.cyj.MyFirstProject.mapper")
public class MyBootApplication{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		SpringApplication.run(MyBootApplication.class, args);	
		
	}
}