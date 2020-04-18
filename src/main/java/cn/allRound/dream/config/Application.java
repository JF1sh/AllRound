package cn.allRound.dream.config;


import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("cn")
@MapperScan("cn.allRound.dream.mapper")
public class Application {

    private static Logger log =Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        Environment env = app.run(args).getEnvironment();
        log.info("ok");
        System.out.println("启动成功！！");
        System.out.println("根地址: \t\thttp://127.0.0.1:" + env.getProperty("server.port"));
        System.out.println("登录接口: \thttp://127.0.0.1:" + env.getProperty("server.port") + "/user/login?loginName=test&password=test");
    }

}