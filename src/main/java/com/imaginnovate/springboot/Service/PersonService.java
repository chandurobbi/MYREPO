package com.imaginnovate.springboot.Service;

import com.imaginnovate.springboot.Entity.Person;
import com.imaginnovate.springboot.Repo.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person saveperson(Person p){
      return personRepository.save(p);
    }
    public List<Person> saveall(List<Person> persons){
        return personRepository.saveAll(persons);
    }
    public Person findbyfname(String fname){
        return personRepository.findByfname(fname);
    }
    public Person findbylname(String lname){
        return personRepository.findBylname(lname);}
    public List<Person> getallpersons(){
        return personRepository.findAll();}

}

