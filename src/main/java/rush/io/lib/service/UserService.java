package rush.io.lib.service;

import rush.io.lib.dao.UserDao;
import rush.io.lib.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by root on 16-12-31.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean register(User user) {
        User u = userDao.findUserByName(user.getName());
        if (!u.getName().equals(user.getName())) {
            userDao.register(user);
        }
        return false;
    }

    public boolean loginCheck(User user) {
        User u = userDao.findUserByName(user.getName());
        return user.getPassword().equals(u.getPassword());
    }
}
