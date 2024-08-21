package com.cab.register.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cab.register.model.BookingData;
import java.util.List;



@Repository
public interface BookingRepo extends JpaRepository<BookingData,Integer>{

    @Query("SELECT b FROM BookingData b WHERE b.email = ?1")
    List<BookingData> findByEmail(String email);
    
}
