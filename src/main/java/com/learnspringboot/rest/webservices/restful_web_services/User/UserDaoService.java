package com.learnspringboot.rest.webservices.restful_web_services.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users=new ArrayList();
  static{
    users.add(new User(1,"Adam",LocalDate.now().minusYears(30)));
    users.add(new User(2,"Jim",LocalDate.now().minusYears(30)));
    users.add(new User(3,"Eve",LocalDate.now().minusYears(25
    )));
    
  }
  public List<User> findAll(){
    return users;
  }
}
