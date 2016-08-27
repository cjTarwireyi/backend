package busbooking.api;

import busbooking.App;
import busbooking.domain.Bus;
import busbooking.factory.BusFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

/**
 * Created by Cornelious on 8/11/2016.
 */
@RunWith( SpringJUnit4ClassRunner.class )
@SpringApplicationConfiguration(classes = App.class)

@WebAppConfiguration
public class BusControllerTest extends AbstractTestNGSpringContextTests {

/*
    @Test
    public void testCreate(){
        String URI =  "http://localhost:8080/bu";
        RestTemplate restTemplate = new RestTemplate();
        Bus bus = BusFactory.createBus("testApi",20);
        restTemplate.postForObject(URI,bus, Bus.class );
    }
    @Test
    public void testFindById() {
        String URI =  "http://localhost:8080/bu/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Bus bus= restTemplate.getForObject(URI, Bus.class, "7");
        Assert.assertNotNull(bus);
        Assert.assertEquals(0, bus.getSeats());

        Assert.assertEquals("CA45678", bus.getNumberPlate());
    }
    @Test
    public void testUpdate(){
        String URI =  "http://localhost:8080/bu/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Bus bus= restTemplate.getForObject(URI, Bus.class, "23");
        if(bus!=null) {
            String UPDATE_URI = "http://localhost:8080/bus";
            Bus updateBus = new Bus.BusBuilder()
                    .copy(bus)
                    .getnumberPlate("successApi")
                    .build();
            restTemplate.put(UPDATE_URI,updateBus);
            Bus updatedBus= restTemplate.getForObject(URI, Bus.class, "23");

            Assert.assertNotEquals(updatedBus.getNumberPlate(),bus.getNumberPlate());
        }
    }
    @Test
    public void testFindAll(){
        String URI =  "http://localhost:8080/bu";
        RestTemplate restTemplate = new RestTemplate();
        Set busSet = restTemplate.getForObject(URI,Set.class);
        Assert.assertTrue(busSet.size()>0);
    }
    @Test
    public void testDelete(){
        String URI =  "http://localhost:8080/bu/{id}";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URI,"28");
        Bus bus= restTemplate.getForObject(URI, Bus.class, "28");

        Assert.assertNull(bus);


    }*/

}
