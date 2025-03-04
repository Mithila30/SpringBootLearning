package com.learnspringboot.rest.webservices.restful_web_services.User;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserResource {
    private UserDaoService service;
    public UserResource(UserDaoService service){
        this.service=service;
    }
//Get Resources
@GetMapping("/users")
public String getMethodName(@RequestParam String param) {
    return new String();
}

public List<User> retrieveAllUsers(){
    return service.findAll();
}
}
