package com.models.person;

public abstract class Person {
    private int id;//identification.
    private String name;//Full Name.
    private int years;//Years in the university.

    public Person (int id, String name, int years) {
        this.id = id;
        this.name = name;
        this.years = years;
    }

    public int getId ( ) {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getYears ( ) {
        return years;
    }

    public void setYears (int years) {
        this.years = years;
    }

    public abstract   double calculateSalary();
}
