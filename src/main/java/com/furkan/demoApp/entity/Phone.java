package com.furkan.demoApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor@NoArgsConstructor
@Getter@Setter
public class Phone extends AbstractEntity implements Cloneable{

    private String number;


}
