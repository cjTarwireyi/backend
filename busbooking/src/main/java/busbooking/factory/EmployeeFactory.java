package busbooking.factory;


import busbooking.domain.EmployeeAddress;
import busbooking.domain.EmployeeEntity;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class EmployeeFactory {
    public static EmployeeEntity createEmployee(String idNum, String name, String lastname, EmployeeAddress address){
        return new EmployeeEntity.EmployeeBuilder()
                .idNumber(idNum)
                .name(name)
                .lastName(lastname)
                .address(address)
                .build();
    }
}
