package com.xy.bootssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement//开启事务
@MapperScan("com.xy.bootssm.dao")//扫描dao
public class BootssmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootssmApplication.class, args);
	}

}

