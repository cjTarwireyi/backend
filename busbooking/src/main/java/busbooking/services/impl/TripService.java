package busbooking.services.impl;

import busbooking.domain.Ticket;
import busbooking.domain.Trip;
import busbooking.repository.TripRepository;
import busbooking.services.ITicketService;
import busbooking.services.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Service
public class TripService implements ITripService {
    @Autowired
    private TripRepository repository;

    @Override
    public Trip create(Trip entity) {
        return repository.save(entity);
    }

    @Override
    public Trip readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Trip> readAll() {
        Iterable<Trip> trips = repository.findAll();
        Set<Trip> tripSet = new HashSet<>();
        for(Trip trip : trips){
            tripSet.add(trip);
        }
        return tripSet;
    }

    @Override
    public Trip update(Trip entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Trip entity) {
        repository.delete(entity);
    }
}
