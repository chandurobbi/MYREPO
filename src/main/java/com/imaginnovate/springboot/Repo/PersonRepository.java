package com.imaginnovate.springboot.Repo;

import com.imaginnovate.springboot.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonRepository extends JpaRepository<Person,Long> {
    Person findByfname(String fname);

    Person findBylname(String lname);
}
