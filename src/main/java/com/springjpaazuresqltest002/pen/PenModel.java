package com.springjpaazuresqltest002.pen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PenModel {
    @Id
            @GeneratedValue
    long id;
    String name;

    public PenModel(){}

    public PenModel(String name) {
        this.name = name;
    }
}
