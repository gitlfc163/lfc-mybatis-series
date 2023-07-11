package lfcmybatisplus.samples2.lfcmybatisplus;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @MapperScan("lfcmybatisplus.samples2.lfcmybatisplus.mapper")
public class LfcApplication {

	public static void main(String[] args) {
		// 全局异步日志开启，提高日志性能
		// Log4jContextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector
		SpringApplication.run(LfcApplication.class, args);
	}

}
