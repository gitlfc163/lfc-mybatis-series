package lfcmybatisplus.samples.lfcmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 注入相关的mapper包
@MapperScan("lfcmybatisplus.samples.lfcmybatisplus.mapper")

public class LfcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LfcApplication.class, args);
	}

}
