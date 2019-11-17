package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.dao.UserDao;
import user.entity.User;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User queryUserById(Long id){
      User user=  userDao.selectByPrimaryKey(id);
      user.setId(1L);
      user.setName("DL");
      user.setUserName("dl1234");
      user.setPassWord("111111");
        return user;
    }
}
