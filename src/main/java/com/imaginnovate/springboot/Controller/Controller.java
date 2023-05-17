package com.imaginnovate.springboot.Controller;

import com.imaginnovate.springboot.Entity.Person;
import com.imaginnovate.springboot.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller {
    @Autowired
    private PersonService personService;
    @GetMapping("/hi")
    public String hello(){
         return "good morning imaginnovate";
    }
    @PostMapping("/save person")
    public Person saveperson(@RequestBody Person person){

        return personService.saveperson(person);
    }
    @GetMapping("/get")
    public List<Person> getallpersons(){
        return personService.getallpersons();}
    }


