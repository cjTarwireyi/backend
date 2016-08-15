package busbooking.repository;
import busbooking.domain.Passenger;
import busbooking.domain.PassengerAddress;
import busbooking.factory.AddressFactory;
import busbooking.factory.PassengerFactory;
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
public class PassenngerCrudTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private  PassengerRepository repository;

    @Test
    public void testCreate() throws Exception {
        //repository.deleteAll();
        PassengerAddress employeeAddress = AddressFactory.createPassangerAddress("admin","test","0000");
        Passenger passenger = PassengerFactory.createPassenger("admin","test",employeeAddress);
        Passenger savedPassenger=repository.save(passenger);

        assertNotNull("CREATE TEST",savedPassenger);
    }

    @Test(dependsOnMethods = "testCreate")
    public void testReadAll() throws Exception {
        Iterable<Passenger> passengers =  repository.findAll();

        assertNotNull("READ TEST",passengers);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdate() throws Exception {
        Passenger passengerFound= repository.findOne(1L);
        Passenger updatePassenger = new Passenger.PassengerBuilder()
                .copy(passengerFound)
                .name("testupdate")
                .build();
        Passenger updatedPassenger=repository.save(updatePassenger);
        Assert.assertSame("UPDATE TEST",updatePassenger.getName(),updatedPassenger.getName());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Passenger foundPassemger = repository.findOne(2L);
        if(foundPassemger !=null) {
            assertNotNull("BEFORE DELETE TEST",foundPassemger);
            repository.delete(2L);
            Passenger deletedpassenger = repository.findOne(2L);

            assertNull("DELETE TEST",deletedpassenger);
        }

    }
}
