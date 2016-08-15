package busbooking.factory;

import busbooking.domain.Trip;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Cornelious on 8/7/2016.
 */
public class TripTest {
    private Trip trip;

    @Test
    public void testCreate() throws Exception {
        trip = TripFactory.createTrip("CPT","12hrs","JHB");

        Assert.assertEquals(trip.getDestination(),"JHB");
        Assert.assertEquals(trip.getDeparture(),"CPT");
        Assert.assertEquals(trip.getTime(),"12hrs");
    }

    @Test
    public void testUpdate() throws Exception {
        trip = TripFactory.createTrip("CPT","12hrs","JHB");

        Trip copyTrip = new Trip.TripBuilder()
                .copy(trip)
                .time("10hrs")
                .build();
        Assert.assertEquals(copyTrip.getDeparture(),"CPT");
        Assert.assertEquals(copyTrip.getTime(),"10hrs");

    }
}
