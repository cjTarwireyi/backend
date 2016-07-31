package busbooking.client;

import busbooking.domain.Passenger;
import busbooking.services.impl.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by Cornelious on 7/31/2016.
 */
@RestController
public class PassengerController {
    @Autowired
    private PassengerService service;

    @RequestMapping(value = "/passenger/", method = RequestMethod.POST)
    public ResponseEntity<Void> createStory(@RequestBody Passenger passenger, UriComponentsBuilder ucBuilder) {
        service.create(passenger);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/passenger/{id}").buildAndExpand(passenger.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
