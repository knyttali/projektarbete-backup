package sti.aaj.domain;

import java.util.ArrayList;

public class Student extends Person{

    private String name;
    private String surname;
    private int id;

    public Student(String name, String surname, int id) {

        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String toString(){
        return name + " " + surname + " " + id;
    }
    
}
