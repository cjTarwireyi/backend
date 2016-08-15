package busbooking.factory;

import busbooking.domain.EmployeeAddress;
import busbooking.domain.EmployeeEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Cornelious on 8/7/2016.
 */
public class EmployeeTest {
    private EmployeeEntity employeeEntity;
    private EmployeeAddress employeeAdress;

    @Test
    public void testCreate() throws Exception {
        employeeAdress = AddressFactory.createEmployeeAddress("admin","testCity","1000");
        employeeEntity = EmployeeFactory.createEmployee("test id","admin","testlastname",employeeAdress);
        Assert.assertNotNull(employeeEntity);
        Assert.assertEquals(employeeEntity.getObjAddress().getStreet(),"admin");
    }

    @Test
    public void testUpdate() throws Exception {
        employeeAdress = AddressFactory.createEmployeeAddress("admin","testCity","1000");
        employeeEntity = EmployeeFactory.createEmployee("test id","admin","testlastname",employeeAdress);

        EmployeeEntity copyEmployee = new EmployeeEntity.EmployeeBuilder()
                .copy(employeeEntity)
                .address(employeeAdress)
                .name("testName")
                .build();
        Assert.assertEquals(copyEmployee.getEmpName(),"testName");

    }
}
