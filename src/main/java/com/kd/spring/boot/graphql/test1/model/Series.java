package com.kd.spring.boot.graphql.test1.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Series implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "seasons")
    private Integer nrOfSeasons;

    public Series() { }

    public Series(String name, Integer nrOfSeasons) {
        this.name = name;
        this.nrOfSeasons = nrOfSeasons;
    }
    // equals() and hashcode() implemented below omitted ...
    // getter's and setter's implemented below omitted ...
}
