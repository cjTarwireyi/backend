package busbooking.services.impl;

import busbooking.domain.BusSupplier;
import busbooking.repository.BusSupplierRepository;
import busbooking.services.IBusSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Service
public class BusSupplierService implements IBusSupplierService {
    @Autowired
   private BusSupplierRepository repository;
    @Override
    public BusSupplier create(BusSupplier entity) {
        return repository.save(entity) ;
    }

    @Override
    public BusSupplier readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<BusSupplier> readAll() {
        Iterable<BusSupplier> suppliers =repository.findAll();
        Set supplierSet = new HashSet();
        for(BusSupplier supplier:suppliers){
            supplierSet.add(supplier);
        }
        return supplierSet;
    }

    @Override
    public BusSupplier update(BusSupplier entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(BusSupplier entity) {
        repository.delete(entity);
    }
}
