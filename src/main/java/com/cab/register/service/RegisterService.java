package com.cab.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.register.model.Register;
import com.cab.register.repository.RegisterRepo;

@Service
public class RegisterService {

    @Autowired
    public RegisterRepo registerRepo;

    public boolean saveStudent(Register register)
    {
        try{
            registerRepo.save(register);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }


    

  

    
}
