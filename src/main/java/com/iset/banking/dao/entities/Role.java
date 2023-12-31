package com.iset.banking.dao.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class Role {

    @Id
    @GeneratedValue
    private Integer idRole;
    private String name;

}
