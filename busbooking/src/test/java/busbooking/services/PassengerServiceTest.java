package busbooking.services;
import busbooking.App;
import busbooking.domain.Passenger;
import busbooking.domain.PassengerAddress;
import busbooking.factory.AddressFactory;
import busbooking.factory.PassengerFactory;
import busbooking.services.impl.PassengerService;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import org.testng.annotations.Test;
import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
/**
 * Created by Cornelious on 8/7/2016.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class PassengerServiceTest extends AbstractTestNGSpringContextTests {
   /* @Autowired
     private  PassengerService service;

    @Test
    public void testCreate() throws Exception {
        //repository.deleteAll();
        PassengerAddress employeeAddress = AddressFactory.createPassangerAddress("admin","test","0000");
        Passenger passenger = PassengerFactory.createPassenger("admin","test",employeeAddress);
        Passenger savedPassenger=service.create(passenger);

        assertNotNull("CREATE TEST",savedPassenger);
    }

    @Test(dependsOnMethods = "testCreate")
    public void testReadAll() throws Exception {
        Iterable<Passenger> passengers =  service.readAll();

        assertNotNull("READ TEST",passengers);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdate() throws Exception {
        Passenger passengerFound= service.readById(1L);
        Passenger updatePassenger = new Passenger.PassengerBuilder()
                .copy(passengerFound)
                .name("service testupdate")
                .build();
        Passenger updatedPassenger=service.update(updatePassenger);
        Assert.assertSame("UPDATE TEST",updatePassenger.getName(),updatedPassenger.getName());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Passenger foundPassemger = service.readById(3L);
        if(foundPassemger !=null) {
            assertNotNull("BEFORE DELETE TEST",foundPassemger);
            service.delete(foundPassemger);
            Passenger deletedpassenger = service.readById(3L);

            assertNull("DELETE TEST",deletedpassenger);
        }

    }*/
}
