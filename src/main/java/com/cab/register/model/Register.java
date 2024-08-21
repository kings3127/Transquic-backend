package com.cab.register.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Register {
    
    @Id
    String email;
    String firstName;
    String lastName;
    String password;
    
    

}

