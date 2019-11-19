package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    public String getUserById(Long id){
     String user= restTemplate.getForObject("http://localhost:8080/user/"+id,String.class);
        return user;
    }
}
