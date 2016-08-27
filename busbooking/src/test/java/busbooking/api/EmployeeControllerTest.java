package busbooking.api;

import busbooking.domain.EmployeeAddress;
import busbooking.domain.EmployeeEntity;
import busbooking.factory.AddressFactory;
import busbooking.factory.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

/**
 * Created by Cornelious on 8/11/2016.
 */
public class EmployeeControllerTest {
   /* @Test
    public void testCreate(){
        String URI =  "http://localhost:8080/emp";
        RestTemplate restTemplate = new RestTemplate();
        EmployeeAddress employeeAddress = AddressFactory.createEmployeeAddress("testApi","admin","1000");
        EmployeeEntity employeeEntity = EmployeeFactory.createEmployee("testApi","test","admin",employeeAddress);
        restTemplate.postForObject(URI,employeeEntity, EmployeeEntity.class );
    }
    @Test
    public void testFindById() {
        String URI =  "http://localhost:8080/emp/{id}";
        RestTemplate restTemplate = new RestTemplate();
        EmployeeEntity employeeEntity= restTemplate.getForObject(URI, EmployeeEntity.class, "7");
        Assert.assertNotNull(employeeEntity);
        Assert.assertEquals("admin", employeeEntity.getEmpName());

        Assert.assertEquals("test", employeeEntity.getEmpLastName());
    }
    @Test
    public void testUpdate(){
        String URI =  "http://localhost:8080/emp/{id}";
        RestTemplate restTemplate = new RestTemplate();
        EmployeeEntity employeeEntity= restTemplate.getForObject(URI, EmployeeEntity.class, "5");
        if(employeeEntity!=null) {
            String UPDATE_URI = "http://localhost:8080/emp";
            EmployeeEntity updateEmployee = new EmployeeEntity.EmployeeBuilder()
                    .copy(employeeEntity)
                    .name("successApi")
                    .build();
            restTemplate.put(UPDATE_URI,updateEmployee);
            EmployeeEntity updatedEmployee= restTemplate.getForObject(URI, EmployeeEntity.class, "5");

            Assert.assertNotEquals(updatedEmployee.getEmpName(), updatedEmployee.getEmpName());
        }
    }
    @Test
    public void testFindAll(){
        String URI =  "http://localhost:8080/emp";
        RestTemplate restTemplate = new RestTemplate();
        Set employeeSet = restTemplate.getForObject(URI,Set.class);
        Assert.assertTrue(employeeSet.size()>0);
    }
    @Test
    public void testDelete(){
        String URI =  "http://localhost:8080/emp/{id}";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URI,"1");
        EmployeeEntity employeeEntity= restTemplate.getForObject(URI, EmployeeEntity.class, "1");

        Assert.assertNull(employeeEntity);


    }*/
}
