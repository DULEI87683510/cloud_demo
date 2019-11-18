package user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *@ClassName RestConfig
 *@Description TODO
 *@Author DL
 *@Date 2019/11/18 16:28    
 *@Version 1.0
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
