package busbooking.services.impl;

import busbooking.domain.Ticket;
import busbooking.services.ITicketService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Service
public class TicketService implements ITicketService {
    @Override
    public Ticket create(Ticket entity) {
        return null;
    }

    @Override
    public Ticket readById(Long aLong) {
        return null;
    }

    @Override
    public Set<Ticket> readAll() {
        return null;
    }

    @Override
    public Ticket update(Ticket entity) {
        return null;
    }

    @Override
    public void delete(Ticket entity) {

    }
}
