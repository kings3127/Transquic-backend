package com.cab.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cab.register.model.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register,String>{

    
    
}
