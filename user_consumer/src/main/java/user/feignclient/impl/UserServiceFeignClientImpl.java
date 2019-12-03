package user.feignclient.impl;

import org.springframework.stereotype.Component;
import user.feignclient.UserServiceFeignClient;

/**
 *@className UserServiceFeignClientImpl
 *@Description TODO
 *@author DL
 *@date 2019/11/28 10:07
 *@version 1.0
 */
@Component
public class UserServiceFeignClientImpl implements UserServiceFeignClient {
    @Override
    public String queryUserById(Long id) {
        return "对不起，服务繁忙，请您稍后再试！";
    }
}
