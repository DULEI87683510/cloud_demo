package user.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 *@ClassName Uservice
 *@Description TODO
 *@Author DL
 *@Date 2019/11/18 16:34    
 *@Version 1.0
 */
@Service
public class Uservice {
    @Autowired
    private RestTemplate restTemplate;
    /**
     *  Eureka客户端，可以获取到服务实例信息
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    public String getUserById(Long id){
        //只需要填写服务名称就可以了
        String url="http://user-service/user/";
        String user=restTemplate.getForObject(url+id,String.class);
        return user;
    }
}
