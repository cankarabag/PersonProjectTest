package com.furkan.demoApp.dao;

import com.furkan.demoApp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDAO extends JpaRepository<Person,Long> {

    List<Person> findAll();

    Person getById(Long id);



}
