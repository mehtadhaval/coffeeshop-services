package com.coffeeshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class User {

    @Id
    private Long id;

    @NotNull
    private String name;
}