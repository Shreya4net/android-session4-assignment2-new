package com.dce.puja.myapp6;

/**
 * Created by Devendra on 3/15/2017.
 */

public class Person {
 int id;
    String name;
    String city;
    double phoneno;


public Person()
{}
    public Person(int id, String name, double phoneno){
        this.id=id;
        this.name=name;
        this.city=city;
        this.phoneno=phoneno;


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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(double phoneno) {
        this.phoneno = phoneno;
    }
}
