package busbooking.api;

import busbooking.domain.Passenger;
import busbooking.domain.PassengerAddress;
import busbooking.factory.AddressFactory;
import busbooking.factory.PassengerFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

/**
 * Created by Cornelious on 8/11/2016.
 */
public class PassengerControllerTest {
    @Test
    public void testCreate(){
        String URI =  "http://localhost:8080/pass";
        RestTemplate restTemplate = new RestTemplate();
        PassengerAddress passengerAddress = AddressFactory.createPassangerAddress("testApi","admin","1000");
        Passenger passenger = PassengerFactory.createPassenger("testApi","test",passengerAddress);
        restTemplate.postForObject(URI,passenger, Passenger.class );
    }
    @Test
    public void testFindById() {
        String URI =  "http://localhost:8080/pass/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Passenger passenger= restTemplate.getForObject(URI, Passenger.class, "6");
        Assert.assertNotNull(passenger);
        Assert.assertEquals("testApi", passenger.getName());

        Assert.assertEquals("test", passenger.getLastName());
    }
    @Test
    public void testUpdate(){
        String URI =  "http://localhost:8080/pass/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Passenger passenger= restTemplate.getForObject(URI, Passenger.class, "4");
        if(passenger!=null) {
            String UPDATE_URI = "http://localhost:8080/pass";
            Passenger updatePassenger = new Passenger.PassengerBuilder()
                    .copy(passenger)
                    .name("successApi")
                    .build();
            restTemplate.put(UPDATE_URI,updatePassenger);
            Passenger updatedPassenger= restTemplate.getForObject(URI, Passenger.class, "4");

            Assert.assertEquals(updatePassenger.getName(), updatedPassenger.getName());
        }
    }
    @Test
    public void testFindAll(){
        String URI =  "http://localhost:8080/pass";
        RestTemplate restTemplate = new RestTemplate();
        Set employeeSet = restTemplate.getForObject(URI,Set.class);
        Assert.assertTrue(employeeSet.size()>0);
    }
    @Test
    public void testDelete(){
        String URI =  "http://localhost:8080/pass/{id}";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URI,"1");
        Passenger passenger= restTemplate.getForObject(URI, Passenger.class, "1");

        Assert.assertNull(passenger);


    }
}
