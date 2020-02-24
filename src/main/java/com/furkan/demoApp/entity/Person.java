package com.furkan.demoApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class Person extends AbstractEntity implements Cloneable {

    private String name;
    private String surname;

}
