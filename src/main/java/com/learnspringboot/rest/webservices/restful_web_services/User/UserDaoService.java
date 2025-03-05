package com.learnspringboot.rest.webservices.restful_web_services.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users=new ArrayList();
    private static int userscount=3;
  static{
    users.add(new User(1,"Adam",LocalDate.now().minusYears(30)));
    users.add(new User(2,"Jim",LocalDate.now().minusYears(30)));
    users.add(new User(3,"Eve",LocalDate.now().minusYears(25
    )));
    
  }
  public List<User> findAll(){
    return users;
  }
  public User findOne(int id){
    Predicate<? super User> predicate= user -> user.getId().equals(id);
       return users.stream().filter(predicate).findFirst().get();
    
  }
  public User save (User user){
    user.setId(++userscount);
    users.add(user);
    return user;
  }
}
