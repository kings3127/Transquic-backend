package com.cab.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.register.model.Register;
import com.cab.register.repository.RegisterRepo;

@Service
public class LoginService {
    
    @Autowired
    public RegisterRepo registerRepo;

    public Register getById(String email)
    {
        return registerRepo.findById(email).orElse(null);
    }
}
