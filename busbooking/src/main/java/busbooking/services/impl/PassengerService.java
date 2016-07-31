package busbooking.services.impl;

import busbooking.domain.Passenger;
import busbooking.repository.PassengerRepository;
import busbooking.services.IPassengerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Service
public class PassengerService implements IPassengerService{
    PassengerRepository repo;
    @Override
    public Passenger create(Passenger entity) {
        return repo.save(entity);
    }

    @Override
    public Passenger readById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public Set<Passenger> readAll() {
        return null;
    }

    @Override
    public Passenger update(Passenger entity) {
        return null;
    }

    @Override
    public void delete(Passenger entity) {

    }
}
