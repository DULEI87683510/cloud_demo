package user.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import user.feignclient.UserServiceFeignClient;


/**
 *@ClassName Uservice
 *@Description TODO
 *@Author DL
 *@Date 2019/11/18 16:34    
 *@Version 1.0
 */
@Service
public class Uservice {
    /**
     *  Eureka客户端，可以获取到服务实例信息
     */
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private UserServiceFeignClient  userServiceFeignClient;
    //申明一个失败回滚的方法
    public String getUserById(Long id){
     String user=userServiceFeignClient.queryUserById(id);
        return user;
    }

}
