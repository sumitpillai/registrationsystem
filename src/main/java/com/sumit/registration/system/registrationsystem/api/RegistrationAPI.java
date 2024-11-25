package com.sumit.registration.system.registrationsystem.api;

import com.sumit.registration.system.registrationsystem.dto.UserDTO;
import com.sumit.registration.system.registrationsystem.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("registration")
//@Controller
//@ResponseBody
@RestController
public class RegistrationAPI {
    @Autowired
    UserRegistrationService userRegistrationService;

    @PostMapping("")
    public void test(@RequestBody UserDTO userDTO){
        this.userRegistrationService.register(userDTO);
    }

}
