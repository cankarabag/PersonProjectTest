package com.furkan.demoApp.endpoint;

import com.furkan.demoApp.entity.Person;
import com.furkan.demoApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonREST {

    @Autowired PersonService personService;


    @GetMapping
    Person getPersonById(@PathVariable(value = "id") Long id){
        return personService.getPersonById(id);
    }
}
