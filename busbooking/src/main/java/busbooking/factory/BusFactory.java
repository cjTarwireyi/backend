package busbooking.factory;

import busbooking.domain.Bus;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class BusFactory {
    public static Bus createBus(String numPlate, int seatsNum){
        return new Bus.BusBuilder()
                .getnumberPlate(numPlate)
                .seats(seatsNum)
                .build();
    }
}
