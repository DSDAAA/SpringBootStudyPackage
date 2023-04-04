package com.itheima.controller;

import com.itheima.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /*@Value("${name}")
    private String name;

    @Value("${person1.name}")
    private String personName;

    @Value("${person1.age}")
    private int personAge;

    @Value("${address1[0]}")
    private int address;*/

    @Autowired
    private Person person;

    @RequestMapping("/hello2")
    public String hello2(){
        /*System.out.println(name);
        System.out.println(personName);
        System.out.println(personAge);
        System.out.println(address);*/
        System.out.println(person);
        return "hello Spring Boot 2222!";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello Spring Boot !";
    }
}
