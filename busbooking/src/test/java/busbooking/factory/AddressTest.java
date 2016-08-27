package busbooking.factory;

import busbooking.domain.EmployeeAddress;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Cornelious on 7/31/2016.
 */
public class AddressTest {
  /*  @Test
    public void testCreate(){
        EmployeeAddress address = AddressFactory.createEmployeeAddress(
                "199 solaria","Muizenberg","7945"
        );
        Assert.assertEquals(address.getStreet(),"199 solaria");
        Assert.assertEquals(address.getCity(),"Muizenberg");
        Assert.assertEquals(address.getCode(),"7945");


    }

    @Test
    public void testUpdate(){
        EmployeeAddress address = AddressFactory.createEmployeeAddress(
                "199 solaria","Muizenberg","7945"
        );
        EmployeeAddress copyAddress = new EmployeeAddress.AddressBuilder()
                .copy(address)
                .code("8000")
                .build();


        Assert.assertEquals(copyAddress.getStreet(),"199 solaria");
        Assert.assertEquals(copyAddress.getCity(),"Muizenberg");
        Assert.assertEquals(copyAddress.getCode(),"8000");

    }*/
}
