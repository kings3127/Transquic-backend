package com.cab.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.cab.register.model.BookingData;
import com.cab.register.model.Register;
import com.cab.register.service.BookingService;
import com.cab.register.service.RegisterService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RegisterController {
    

    @Autowired
    public RegisterService registerService;

    @Autowired
    public BookingService bookingService;

    // @Autowired

    
     @PostMapping("/reg")
    public boolean post(@RequestBody Register register){
       if(registerService.saveStudent(register))
       return true;
       return false;
    }

    @PostMapping("/booking")
    public BookingData post(@RequestBody BookingData booking){
    return bookingService.saveBooking(booking);
       
    }

    @GetMapping("/bookings/{email}")
    public List<BookingData> getAll(@PathVariable String email)
    {
        return bookingService.getAll(email);
    }





   
}
