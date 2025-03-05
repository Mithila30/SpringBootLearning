package com.learnspringboot.rest.webservices.restful_web_services.User;

import java.net.URI;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserResource {
    private UserDaoService service;
    public UserResource(UserDaoService service){
        this.service=service;
    }
//Get Resources
@GetMapping(path="/users")
public List<User> retrieveAllUsers(){
    return service.findAll();
}

@GetMapping(path="/users/{idno}")
public User retrieveSpecificUser(@PathVariable int idno){
    return service.findOne(idno);
}

@PostMapping("/users")

public ResponseEntity<Object> createuser(@RequestBody User user){
  User savedUser=service.save(user);
  URI location=ServletUriComponentsBuilder.fromCurrentRequest()
  .path("/{id}")
  .buildAndExpand(savedUser.getId())
  .toUri();
return ResponseEntity.created(location).build();
}
}
