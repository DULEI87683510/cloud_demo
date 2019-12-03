package zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *@ClassName 服务启动类
 *@Description TODO
 *@Author DL
 *@Date 2019/11/19 17:25    
 *@Version 1.0
 */


@SpringBootApplication
//开启zuul网关功能
@EnableZuulProxy
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class,args);
    }
}