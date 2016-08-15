package busbooking.repository;

/**
 * Created by Cornelious on 8/7/2016.
 */
import busbooking.domain.Trip;
import busbooking.factory.TripFactory;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import busbooking.App;
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TripCrudTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private TripRepository repository;

    @Test
    public void testCreate() throws Exception {
        //repository.deleteAll();

        Trip trip = TripFactory.createTrip("admin","test","test");
        Trip savedTrip=repository.save(trip);

        assertNotNull("CREATE TEST",savedTrip);
    }

    @Test(dependsOnMethods = "testCreate")
    public void testReadAll() throws Exception {
        Iterable<Trip> trips =  repository.findAll();

        assertNotNull("READ TEST",trips);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdate() throws Exception {
        Trip tripFound= repository.findOne(1L);
        Trip updateTrip = new Trip.TripBuilder()
                .copy(tripFound)
                .destination("testupdate")
                .build();
        Trip updatedTrip=repository.save(updateTrip);
        Assert.assertSame("UPDATE TEST",updateTrip.getDestination(),updatedTrip.getDestination());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Trip foundTrip = repository.findOne(2L);
        if(foundTrip !=null) {
            assertNotNull("BEFORE DELETE TEST",foundTrip);
            repository.delete(2L);
            Trip deletedTrip = repository.findOne(2L);

            assertNull("DELETE TEST",deletedTrip);
        }

    }
}
