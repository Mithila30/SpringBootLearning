package com.learnspringboot.rest.webservices.restful_web_services.HelloWorld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class HelloWorldController {

@GetMapping(path="/hello-world")
public String helloWorld(){
    return "hello World";
}
@GetMapping(path="/hello-world-bean")
public HelloWorldBean helloWorldBean(){
    return new HelloWorldBean("hello World");
}
@GetMapping(path="/hello-world/path-variable/{name}")
public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
    return new HelloWorldBean(String.format("Hello World, %s",name));
}
}
