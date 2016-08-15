package busbooking.api;

import busbooking.domain.Account;
import busbooking.services.impl.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by Cornelious on 8/9/2016.
 */
@RestController
@RequestMapping(value="/acc")

 class AccountController {

    @Autowired
   private    AccountService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
   public Account findById(@PathVariable Long id){
        return   service.readById(id);
    }

    @RequestMapping(method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Account create(@RequestBody Account resource){
        return  service.create(resource);
    }

    @RequestMapping(method =  RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Account resource){
    service.update(resource);
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Set<Account> findAll(){
        return service.readAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id")Long id){
        Account accountToDelete= service.readById(id);
        if(accountToDelete!=null) {
            service.delete(accountToDelete);
        }
    }
}
