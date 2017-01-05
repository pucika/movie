package rush.io.lib.dao;

import rush.io.lib.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by root on 16-12-31.
 */
@Repository
public class UserDao {
    @Resource
    private SessionFactory sessionFactory;
    private Session getSession() {
        return sessionFactory.openSession();
    }

    public void register(User user) {
        this.getSession().save(user);
    }
    public User getUserById(String id) {
        return (User) this.getSession().createQuery("from  User as u where u.id = ?")
                .setParameter(0, id).uniqueResult();
    }

    public User findUserByName(String userName) {
        return (User)this.getSession().createQuery("from User as u where u.name = ?")
                .setParameter(0, userName).uniqueResult();
    }
    public String getEmail(String name) {
        User user = (User) this.getSession().createQuery("from User as u where u.name = ")
                .setParameter(0, name).uniqueResult();
        return user.getEmail();

    }
}
