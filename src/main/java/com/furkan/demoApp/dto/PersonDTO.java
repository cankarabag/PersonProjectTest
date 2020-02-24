package com.furkan.demoApp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class PersonDTO extends AbstractDTO {

    private String name;
    private String surname;
}
