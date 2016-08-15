package busbooking.api;

import busbooking.domain.Passenger;
import busbooking.services.impl.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Cornelious on 8/11/2016.
 */
@RestController
@RequestMapping(value="/pass")
 class PassengerController {
    @Autowired
    private PassengerService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Passenger findById(@PathVariable Long id){
        return   service.readById(id);
    }

    @RequestMapping(method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Passenger create(@RequestBody Passenger resource){
        return  service.create(resource);
    }

    @RequestMapping(method =  RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Passenger resource){
        service.update(resource);
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Set<Passenger> findAll(){
        return service.readAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id")Long id){
        Passenger passengerToDelete= service.readById(id);
        if(passengerToDelete!=null) {
            service.delete(passengerToDelete);
        }
    }
}
