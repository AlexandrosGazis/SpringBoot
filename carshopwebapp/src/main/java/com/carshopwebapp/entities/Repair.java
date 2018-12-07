package com.carshopwebapp.entities;

import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Repair {

    @Entity
    @Table(name = "repair")
    @Id
    private int id;
    //@Column  if the private name was different from the ones of our db

    @Column(name = "datetime")
    private String date; //match datetime column with a variable named date

    @Column(name="katastasi")     //for date see: https://www.baeldung.com/hibernate-date-time
    private String katastasi;//match katastasi column with a variable named status

    @Column(name="eidosepiskeuis")
    private String eidosepiskeuis;

    @Column(name="kostos")
    private double kostos;

    @Column(name="owner") //here add the connection with other table
    private String owner;

    @Column(name="perigrafi")
    private String perigrafi;
}

