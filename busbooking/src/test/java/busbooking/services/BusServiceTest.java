package busbooking.services;

import busbooking.App;
import busbooking.domain.Bus;
import busbooking.factory.BusFactory;

import busbooking.services.impl.BusService;
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
public class BusServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private   BusService service;

    @Test
    public void testCreateBus() throws Exception {
//        repository.deleteAll();
        Bus bus = BusFactory.createBus("CA45678",30);
        Bus savedBus=service.create(bus);

        assertNotNull("CREATE TEST",bus);
    }

    @Test(dependsOnMethods = "testCreateBus")
    public void testReadAll() throws Exception {
        Iterable<Bus> buses =  service.readAll();

        assertNotNull("READ TEST",buses);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdateAccount() throws Exception {
        Bus busFound= service.readById(2L);
        Bus updateBus = new Bus.BusBuilder()
                .copy(busFound)
                .getnumberPlate("service1245")
                .build();
        Bus updatedBus=service.update(updateBus);
        Assert.assertEquals("UPDATE TEST",updatedBus.getNumberPlate(),updateBus.getNumberPlate());
    }

    @Test(dependsOnMethods = "testUpdateAccount")
    public void testDelete() throws Exception {
        Bus foundBus = service.readById(3L);
        if(foundBus !=null) {
            assertNotNull("BEFORE DELETE TEST",foundBus);
            service.delete(foundBus);
            Bus deletedBus = service.readById(3L);

            assertNull("DELETE TEST",deletedBus);
        }

    }
}
