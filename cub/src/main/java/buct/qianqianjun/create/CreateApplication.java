package buct.qianqianjun.create;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("buct.qianqianjun.create.dao")  //扫描的mapper
public class CreateApplication {

    public static void main(String[] args) {
        //表示启动springboot项目
        SpringApplication.run(CreateApplication.class, args);
    }

}
