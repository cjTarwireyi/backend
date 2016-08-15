package busbooking.services;
import busbooking.App;
import busbooking.domain.BusSupplier;
import busbooking.factory.BusSupplierFactory;
import busbooking.services.impl.BusSupplierService;
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
public class BussSupplierServiceTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private BusSupplierService service;

    @Test
    public void testCreateBusSupplier() throws Exception {
//        repository.deleteAll();
        BusSupplier busSupplier = BusSupplierFactory.createSupplier("serviceTest","1234567890");
        BusSupplier savedBusSupplier=service.create(busSupplier);

        assertNotNull("CREATE TEST",savedBusSupplier);
    }

    @Test(dependsOnMethods = "testCreateBusSupplier")
    public void testReadAll() throws Exception {
        Iterable<BusSupplier> busSuppliers =  service.readAll();

        assertNotNull("READ TEST",busSuppliers);
    }

    @Test(dependsOnMethods = "testReadAll")
    public void testUpdateSupplier() throws Exception {
        BusSupplier supplierFound= service.readById(2L);
        BusSupplier updateSupplier = new BusSupplier.SupplierBuilder()
                .copy(supplierFound)
                .name("service admin")
                .build();
        BusSupplier updatedSupplier=service.update(updateSupplier);
        Assert.assertEquals("UPDATE TEST",updatedSupplier.getName(),updateSupplier.getName());
    }

    @Test(dependsOnMethods = "testUpdateSupplier")
    public void testDelete() throws Exception {
        BusSupplier foundSupplier = service.readById(4L);
        if(foundSupplier !=null) {
            assertNotNull("BEFORE DELETE TEST",foundSupplier);
            service.delete(foundSupplier);
            BusSupplier deletedSupplier = service.readById(4L);

            assertNull("DELETE TEST",deletedSupplier);
        }

    }
}
