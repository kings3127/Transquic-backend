package com.cab.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.cab.register.model.BookingData;
import com.cab.register.repository.BookingRepo;

@Service
public class BookingService {
    
    @Autowired
    public BookingRepo bookingRepo;

      public BookingData saveBooking(BookingData booking)
    {
        
            return bookingRepo.save(booking);
        
        
    }

    public List<BookingData> getAll(String email)
    {
        return bookingRepo.findByEmail(email);
    }
}
