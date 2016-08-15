package busbooking.api;

import busbooking.domain.BusSupplier;
import busbooking.services.impl.BusSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Cornelious on 8/11/2016.
 */
@RestController
@RequestMapping(value="/bussup")

 class BusSupplierController {
    @Autowired
    private BusSupplierService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public BusSupplier findById(@PathVariable Long id){
        return   service.readById(id);
    }

    @RequestMapping(method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public BusSupplier create(@RequestBody BusSupplier resource){
        return  service.create(resource);
    }

    @RequestMapping(method =  RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody BusSupplier resource){
        service.update(resource);
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Set<BusSupplier> findAll(){
        return service.readAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id")Long id){
        BusSupplier supplierToDelete= service.readById(id);
        if(supplierToDelete!=null) {
            service.delete(supplierToDelete);
        }
    }
}
