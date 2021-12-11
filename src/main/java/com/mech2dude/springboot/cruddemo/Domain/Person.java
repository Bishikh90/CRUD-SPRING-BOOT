package com.mech2dude.springboot.cruddemo.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "age")
    private int age;

    @Column(name = "covidInfo")
    private String covidInfo;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public Person() {

    }

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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCovidInfo() {
        return covidInfo;
    }

    public void setCovidInfo(String covidInfo) {
        this.covidInfo = covidInfo;
    }
}
