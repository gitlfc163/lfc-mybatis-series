package lfcmybatisplus.samples.lfcmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")

public class LfcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LfcApplication.class, args);
	}

}
