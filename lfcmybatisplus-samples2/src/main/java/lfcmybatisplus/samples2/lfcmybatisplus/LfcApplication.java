package lfcmybatisplus.samples2.lfcmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @MapperScan("lfcmybatisplus.samples2.lfcmybatisplus.mapper")
public class LfcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LfcApplication.class, args);
	}

}
