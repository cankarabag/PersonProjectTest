package com.furkan.demoApp.service;

import com.furkan.demoApp.dao.PersonDAO;
import com.furkan.demoApp.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired PersonDAO personDAO;

    public Person getPersonById(Long id){
        return personDAO.getById(id);
    }

}