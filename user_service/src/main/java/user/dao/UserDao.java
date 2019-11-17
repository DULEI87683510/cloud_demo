package user.dao;

import org.springframework.stereotype.Component;
import user.entity.User;
@Component
public interface UserDao extends tk.mybatis.mapper.common.Mapper<User> {
}
