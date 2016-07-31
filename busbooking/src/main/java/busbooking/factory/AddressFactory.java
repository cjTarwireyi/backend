package busbooking.factory;

import busbooking.domain.EmployeeAddress;
import busbooking.domain.PassengerAddress;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class AddressFactory {
    public static EmployeeAddress createEmployeeAddress(String street, String city, String code) {
    return new EmployeeAddress.AddressBuilder()
            .street(street)
            .city(city)
            .code(code)
            .build();
       }
    public static PassengerAddress createPassangerAddress (String street, String city, String code){
        return new PassengerAddress.AddressBuilder()
                .street(street)
                .city(city)
                .code(code)
                .build();
    }


}
