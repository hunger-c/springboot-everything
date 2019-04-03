package com.orange.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Z.C.Hemon on 2019/4/2 14:29.
 */
@Entity
@Table(name = "t_dept")
public class Dept implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
