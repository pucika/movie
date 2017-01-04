package rush.io.lib.service;

import rush.io.lib.dao.TicketDao;
import rush.io.lib.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zdl on 2017/1/4.
 */
@Service
public class TicketService {
    @Autowired
    private TicketDao ticketDao;
    long getCount(String movieName) {
        return ticketDao.getCount(movieName);
    }
    public void addTicket(Ticket ticket) {
        ticketDao.addTicket(ticket);
    }
}
