package busbooking.repository;

import busbooking.App;
import busbooking.domain.BusSupplier;
import busbooking.factory.BusSupplierFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

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
/**
 * Created by Cornelious on 8/7/2016.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class BusSupplierCrudTest extends AbstractTestNGSpringContextTests {

    @Autowired
     private   BusSupplierRepository repository;

    @Test
    public void testCreateBusSupplier() throws Exception {
//        repository.deleteAll();
        BusSupplier busSupplier = BusSupplierFactory.createSupplier("Test","1234567890");
        BusSupplier savedBusSupplier=repository.save(busSupplier);

        assertNotNull("CREATE TEST",savedBusSupplier);
    }

    @Test(dependsOnMethods = "testCreateBusSupplier")
    public void testReadAll() throws Exception {
        Iterable<BusSupplier> busSuppliers =  repository.findAll();

        assertNotNull("READ TEST",busSuppliers);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdateSupplier() throws Exception {
        BusSupplier supplierFound= repository.findOne(2L);
        BusSupplier updateSupplier = new BusSupplier.SupplierBuilder()
                .copy(supplierFound)
                .name("admin")
                .build();
        BusSupplier updatedSupplier=repository.save(updateSupplier);
        Assert.assertEquals("UPDATE TEST",updatedSupplier.getName(),updateSupplier.getName());
    }

    @Test(dependsOnMethods = "testUpdateSupplier")
    public void testDelete() throws Exception {
        BusSupplier foundSupplier = repository.findOne(3L);
        if(foundSupplier !=null) {
            assertNotNull("BEFORE DELETE TEST",foundSupplier);
            repository.delete(3L);
            BusSupplier deletedSupplier = repository.findOne(3L);

            assertNull("DELETE TEST",deletedSupplier);
        }

    }
}
