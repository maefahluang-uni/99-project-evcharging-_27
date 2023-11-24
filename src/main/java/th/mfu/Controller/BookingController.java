package th.mfu.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.Domain.Booking;

import javax.validation.Valid;
import java.util.List;


@RestController
public class BookingController {
    @Autowired
    Booking bookingService;
    @PostMapping(value = "/booking", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Booking> booking(@Valid @RequestBody Booking bookingModel) {
        return bookingService.booking(bookingModel);
    }
}
