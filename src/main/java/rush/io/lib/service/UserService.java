package rush.io.lib.service;

import org.springframework.transaction.annotation.Transactional;
import rush.io.lib.dao.UserDao;
import rush.io.lib.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by root on 16-12-31.
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public void register(User user) {
        userDao.register(user);
    }

    public boolean loginCheck(User user) {
        User u = userDao.findUserByName(user.getName());
        return u != null && user.getPassword().equals(u.getPassword());
    }
    public boolean registerCheck(User user) {
        User u = userDao.findUserByName(user.getName());
        return u == null;
    }
}
