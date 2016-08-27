package busbooking.api;

import busbooking.domain.BusSupplier;
import busbooking.factory.BusFactory;
import busbooking.factory.BusSupplierFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

/**
 * Created by Cornelious on 8/11/2016.
 */
public class BusSupplierControllerTest {
 /*   @Test
    public void testCreate(){
        String URI =  "http://localhost:8080/bu";
        RestTemplate restTemplate = new RestTemplate();
        BusSupplier busSupplier = BusSupplierFactory.createSupplier("testApi","test");
        restTemplate.postForObject(URI,busSupplier, BusSupplier.class );
    }
    @Test
    public void testFindById() {
        String URI =  "http://localhost:8080/bussup/{id}";
        RestTemplate restTemplate = new RestTemplate();
        BusSupplier busSupplier= restTemplate.getForObject(URI, BusSupplier.class, "7");
        Assert.assertNotNull(busSupplier);
        Assert.assertEquals("1234567890", busSupplier.getContactNumber());

        Assert.assertEquals("serviceTest", busSupplier.getName());
    }
    @Test
    public void testUpdate(){
        String URI =  "http://localhost:8080/bussup/{id}";
        RestTemplate restTemplate = new RestTemplate();
        BusSupplier busSupplier= restTemplate.getForObject(URI, BusSupplier.class, "5");
        if(busSupplier!=null) {
            String UPDATE_URI = "http://localhost:8080/bussup";
            BusSupplier updateSupplier = new BusSupplier.SupplierBuilder()
                    .copy(busSupplier)
                    .name("successApi")
                    .build();
            restTemplate.put(UPDATE_URI,updateSupplier);
            BusSupplier updatedBus= restTemplate.getForObject(URI, BusSupplier.class, "5");

            Assert.assertNotEquals(updatedBus.getName(), busSupplier.getName());
        }
    }
    @Test
    public void testFindAll(){
        String URI =  "http://localhost:8080/bussup";
        RestTemplate restTemplate = new RestTemplate();
        Set supplierSet = restTemplate.getForObject(URI,Set.class);
        Assert.assertTrue(supplierSet.size()>0);
    }
    @Test
    public void testDelete(){
        String URI =  "http://localhost:8080/bussup/{id}";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URI,"6");
        BusSupplier busSupplier= restTemplate.getForObject(URI, BusSupplier.class, "6");

        Assert.assertNull(busSupplier);


    }
*/
}
