package com.cab.register.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cab.register.model.Register;


import com.cab.register.service.LoginService;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
    
    @Autowired
    public LoginService loginService;
    
      @GetMapping("/login/{email}")
    public Register getId(@PathVariable String email)
    {
        return loginService.getById(email);
    }
}
