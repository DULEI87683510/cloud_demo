package user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName consumer
 * @Description TODO
 * @Author DL
 * @Date 2019/11/18 16:27
 * @Version 1.0
 */


@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix//开启熔断
@EnableFeignClients//开启feign功能
public class UserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }
}
