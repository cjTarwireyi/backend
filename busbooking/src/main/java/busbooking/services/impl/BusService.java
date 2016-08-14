package busbooking.services.impl;

import busbooking.domain.Bus;
import busbooking.repository.BusRepository;
import busbooking.services.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Service
public class BusService implements IBusService {
    @Autowired
   private BusRepository repository;
    @Override
    public Bus create(Bus entity) {
        return repository.save(entity);
    }

    @Override
    public Bus readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Bus> readAll() {
        Iterable<Bus> buses = repository.findAll();
        Set busSet = new HashSet();
        for(Bus bus : buses) {
        busSet.add(bus);
        }
        return busSet;
    }

    @Override
    public Bus update(Bus entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Bus entity) {
        repository.delete(entity);
    }
}
