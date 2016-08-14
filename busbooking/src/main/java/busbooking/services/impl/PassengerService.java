package busbooking.services.impl;

import busbooking.domain.Passenger;
import busbooking.repository.PassengerRepository;
import busbooking.services.IPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Service
public class PassengerService implements IPassengerService{
    @Autowired
    private PassengerRepository repository;

    @Override
    public Passenger create(Passenger entity) {
        return repository.save(entity);
    }

    @Override
    public Passenger readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Passenger> readAll() {
        Iterable<Passenger> passengers = repository.findAll();
        Set<Passenger> passengerSet= new HashSet<>();

        for (Passenger passenger: passengers){
            passengerSet.add(passenger);
        }
        return passengerSet;
    }

    @Override
    public Passenger update(Passenger entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Passenger entity) {
        repository.delete(entity);
    }
}
