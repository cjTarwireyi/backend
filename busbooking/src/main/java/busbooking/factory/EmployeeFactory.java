package busbooking.factory;

import busbooking.domain.Employee;
import busbooking.domain.EmployeeAddress;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class EmployeeFactory {
    public static Employee createEmployee(String idNum, String name, String lastname, EmployeeAddress address){
        return new Employee.EmployeeBuilder()
                .idNumber(idNum)
                .name(name)
                .lastName(lastname)
                .address(address)
                .build();
    }
}
