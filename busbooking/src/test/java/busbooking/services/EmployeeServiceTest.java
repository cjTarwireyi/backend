package busbooking.services;

import busbooking.App;
import busbooking.domain.EmployeeAddress;
import busbooking.domain.EmployeeEntity;
import busbooking.factory.AddressFactory;
import busbooking.factory.EmployeeFactory;
import busbooking.services.impl.EmployeeServices;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by Cornelious on 8/7/2016.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class EmployeeServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private EmployeeServices services;

    @Test
    public void testCreateEmployee() throws Exception {
        //repository.deleteAll();
        EmployeeAddress employeeAddress = AddressFactory.createEmployeeAddress("admin","test","0000");
        EmployeeEntity employeeEntity = EmployeeFactory.createEmployee(" service test","admin","test",employeeAddress);
        EmployeeEntity savedEmployee=services.create(employeeEntity);

        assertNotNull("CREATE TEST",savedEmployee);
    }

    @Test(dependsOnMethods = "testCreateEmployee")
    public void testReadAll() throws Exception {
        Iterable<EmployeeEntity> employees =  services.readAll();

        assertNotNull("READ TEST",employees);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdate() throws Exception {
        EmployeeEntity employeeFound= services.readById(1L);
        EmployeeEntity updateEmployee = new EmployeeEntity.EmployeeBuilder()
                .copy(employeeFound)
                .name("service testupdate")
                .build();
        EmployeeEntity updatedEmployee=services.update(updateEmployee);
        Assert.assertSame("UPDATE TEST",updateEmployee.getEmpName(),updatedEmployee.getEmpName());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        EmployeeEntity foundEmployee = services.readById(3L);
        if(foundEmployee !=null) {
            assertNotNull("BEFORE DELETE TEST",foundEmployee);
            services.delete(foundEmployee);
            EmployeeEntity deletedEmployee = services.readById(3L);

            assertNull("DELETE TEST",deletedEmployee);
        }

    }
}
