package busbooking.repository;

import busbooking.App;

import busbooking.domain.Bus;
import busbooking.factory.BusFactory;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
/**
 * Created by Cornelious on 8/7/2016.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class BusCrudTest extends AbstractTestNGSpringContextTests{
/*
    @Autowired
  private   BusRepository repository;

    @Test
    public void testCreateBus() throws Exception {
//        repository.deleteAll();
        Bus bus = BusFactory.createBus("CA45678",30);
         Bus savedBus=repository.save(bus);

        assertNotNull("CREATE TEST",bus);
    }

    @Test(dependsOnMethods = "testCreateBus")
    public void testReadAll() throws Exception {
        Iterable<Bus> buses =  repository.findAll();

        assertNotNull("READ TEST",buses);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdateAccount() throws Exception {
        Bus busFound= repository.findOne(2L);
        Bus updateBus = new Bus.BusBuilder()
                .copy(busFound)
                .getnumberPlate("admin1245")
                .build();
        Bus updatedBus=repository.save(updateBus);
        Assert.assertEquals("UPDATE TEST",updatedBus.getNumberPlate(),updateBus.getNumberPlate());
    }

    @Test(dependsOnMethods = "testUpdateAccount")
    public void testDelete() throws Exception {
        Bus foundBus = repository.findOne(3L);
        if(foundBus !=null) {
            assertNotNull("BEFORE DELETE TEST",foundBus);
            repository.delete(3L);
            Bus deletedBus = repository.findOne(3L);

            assertNull("DELETE TEST",deletedBus);
        }

    }*/
}
