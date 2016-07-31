package busbooking.factory;

import busbooking.domain.Trip;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class TripFactory {
    public static Trip createTrip(String departure, String time, String destination) {
        return new Trip.TripBuilder()
                .departure(departure)
                .time(time)
                .destination(destination)
                .build();
    }
}
