package com.cab.register.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookingId;
    String email;
    String categoryName;
    String cost;
    String pickupDate;
    String pickupTime;
    String fromLocation;
    String toLocation;
    String optionsString;

}
