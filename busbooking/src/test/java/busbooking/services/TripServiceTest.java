package busbooking.services;
import busbooking.App;
import busbooking.domain.Trip;
import busbooking.factory.TripFactory;
import busbooking.services.impl.TripService;
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
public class TripServiceTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private TripService service;

    @Test
    public void testCreate() throws Exception {
        //repository.deleteAll();

        Trip trip = TripFactory.createTrip("admin","test","test");
        Trip savedTrip=service.create(trip);

        assertNotNull("CREATE TEST",savedTrip);
    }

    @Test(dependsOnMethods = "testCreate")
    public void testReadAll() throws Exception {
        Iterable<Trip> trips =  service.readAll();

        assertNotNull("READ TEST",trips);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdate() throws Exception {
        Trip tripFound= service.readById(1L);
        Trip updateTrip = new Trip.TripBuilder()
                .copy(tripFound)
                .destination("service testupdate")
                .build();
        Trip updatedTrip=service.create(updateTrip);
        Assert.assertSame("UPDATE TEST",updateTrip.getDestination(),updatedTrip.getDestination());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Trip foundTrip = service.readById(3L);
        if(foundTrip !=null) {
            assertNotNull("BEFORE DELETE TEST",foundTrip);
            service.delete(foundTrip);
            Trip deletedTrip = service.readById(3L);

            assertNull("DELETE TEST",deletedTrip);
        }

    }
}
