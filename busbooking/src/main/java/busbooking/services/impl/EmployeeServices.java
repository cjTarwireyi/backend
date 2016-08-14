package busbooking.services.impl;


import busbooking.domain.EmployeeEntity;
import busbooking.repository.EmployeeRepository;
import busbooking.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Service
public class EmployeeServices implements IEmployeeService {

    @Autowired
    private EmployeeRepository repository;
    @Override
    public EmployeeEntity create(EmployeeEntity entity) {
        return repository.save(entity);
    }

    @Override
    public EmployeeEntity readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<EmployeeEntity> readAll() {
        Iterable<EmployeeEntity> employeeEntities = repository.findAll();
        Set<EmployeeEntity> employeeEntitySet = new HashSet<>();
        for(EmployeeEntity employeeEntity : employeeEntities){
            employeeEntitySet.add(employeeEntity);
        }
        return employeeEntitySet;
    }

    @Override
    public EmployeeEntity update(EmployeeEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(EmployeeEntity entity) {
        repository.delete(entity);
    }
}
