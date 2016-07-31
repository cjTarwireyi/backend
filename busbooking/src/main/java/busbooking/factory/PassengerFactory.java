package busbooking.factory;

import busbooking.domain.Passenger;
import busbooking.domain.PassengerAddress;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class PassengerFactory {
    public static Passenger createPassenger(String name, String lastName, PassengerAddress address){
        return new Passenger.PassengerBuilder()
                .name(name)
                .lastName(lastName)
                .address(address)
                .build();
    }
}
