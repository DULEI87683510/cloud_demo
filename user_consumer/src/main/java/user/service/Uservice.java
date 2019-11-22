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
        // 根据服务名称，获取服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("user_service");
        if (instances.isEmpty()){
            throw new RuntimeException("获取的服务实例为空");
        }
        ServiceInstance serviceInstance=  instances.get(0);
        // 获取ip和端口信息
        String baseUrl = "http://"+serviceInstance.getHost() + ":" + serviceInstance.getPort()+"/user/";
        String user= restTemplate.getForObject(baseUrl+id,String.class);
        return user;
    }
}
