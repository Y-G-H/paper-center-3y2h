package cn.y3h2.blog.paper.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {
        "cn.y3h2.blog.paper.provider",
        "cn.y3h2.blog.paper.core",
})
@Configuration
@EnableScheduling
@ImportResource("classpath:/spring/dubbo.xml")
@MapperScan("cn.y3h2.blog.paper.core")
public class DubboStarter {

    public static void main(String[] args) {
        SpringApplication application =
                new SpringApplication(DubboStarter.class);
        application.run(args);
    }

}
