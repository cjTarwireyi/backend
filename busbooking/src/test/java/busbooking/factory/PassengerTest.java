package busbooking.factory;

import busbooking.domain.Passenger;
import busbooking.domain.PassengerAddress;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Cornelious on 8/7/2016.
 */
public class PassengerTest {
    private Passenger passenger;
    private PassengerAddress passengerAddress;

    @Test
    public void testCreate() throws Exception {
        passengerAddress = AddressFactory.createPassangerAddress("streetTest","CityTest","1000");
        passenger = PassengerFactory.createPassenger("admin","testlastname",passengerAddress);

        Assert.assertEquals(passenger.getObjAdress().getStreet(),"streetTest");
        Assert.assertEquals(passenger.getName(),"admin");

    }

    @Test
    public void testUpdate() throws Exception {
        passengerAddress = AddressFactory.createPassangerAddress("streetTest","CityTest","1000");
        passenger = PassengerFactory.createPassenger("admin","testlastname",passengerAddress);

        Passenger copyPassenger = new Passenger.PassengerBuilder()
                .copy(passenger)
                .name("testName")
                .build();
        Assert.assertEquals(copyPassenger.getName(),"testName");
        Assert.assertEquals(copyPassenger.getObjAdress().getCode(),"1000");
    }
}
