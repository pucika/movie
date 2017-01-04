package rush.io.lib.dao;

import rush.io.lib.entity.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by zdl on 2017/1/4.
 */
@Repository
public class TicketDao {
    @Resource
    private SessionFactory sessionFactory;
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    public long getCount(String movieName) {
        Ticket ticket = (Ticket) this.getSession().createQuery("from Ticket t where t.name = ")
                .setParameter(0, movieName).uniqueResult();
        return ticket.getCount();

    }
    public void addTicket(Ticket ticket) {
        this.getSession().save(ticket);
    }
}
