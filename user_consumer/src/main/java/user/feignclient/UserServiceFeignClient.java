package user.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import user.feignclient.impl.UserServiceFeignClientImpl;

/**
 * 1.声明这是一个Feign客户端,通过value属性指定服务名称
 * 2.接口中的定义方法，完全采用SpringMVC的注解，Feign会根据注解帮我们生成URL，并访问获取结果
 */
@FeignClient(value = "user-service",fallback = UserServiceFeignClientImpl.class)
public interface UserServiceFeignClient {
    @GetMapping("/user/{id}")
    String queryUserById(@PathVariable(value = "id") Long id);
}
