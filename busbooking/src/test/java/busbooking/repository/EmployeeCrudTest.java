package busbooking.repository;
import busbooking.domain.EmployeeAddress;
import busbooking.domain.EmployeeEntity;
import busbooking.factory.AddressFactory;
import busbooking.factory.EmployeeFactory;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import busbooking.App;


/**
 * Created by Cornelious on 8/7/2016.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class EmployeeCrudTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private   EmployeeRepository repository;

    @Test
    public void testCreateEmployee() throws Exception {
        //repository.deleteAll();
        EmployeeAddress employeeAddress = AddressFactory.createEmployeeAddress("admin","test","0000");
        EmployeeEntity employeeEntity = EmployeeFactory.createEmployee("2016test","admin","test",employeeAddress);
        EmployeeEntity savedEmployee=repository.save(employeeEntity);

        assertNotNull("CREATE TEST",savedEmployee);
    }

    @Test(dependsOnMethods = "testCreateEmployee")
    public void testReadAll() throws Exception {
        Iterable<EmployeeEntity> employees =  repository.findAll();

        assertNotNull("READ TEST",employees);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdate() throws Exception {
        EmployeeEntity employeeFound= repository.findOne(1L);
        EmployeeEntity updateEmployee = new EmployeeEntity.EmployeeBuilder()
                .copy(employeeFound)
                .name("testupdate")
                .build();
        EmployeeEntity updatedEmployee=repository.save(updateEmployee);
        Assert.assertSame("UPDATE TEST",updateEmployee.getEmpName(),updatedEmployee.getEmpName());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        EmployeeEntity foundEmployee = repository.findOne(2L);
        if(foundEmployee !=null) {
            assertNotNull("BEFORE DELETE TEST",foundEmployee);
            repository.delete(2L);
            EmployeeEntity deletedEmployee = repository.findOne(2L);

            assertNull("DELETE TEST",deletedEmployee);
        }

    }
}
