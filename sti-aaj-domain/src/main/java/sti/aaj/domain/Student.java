package sti.aaj.domain;

import java.util.ArrayList;

public class Student extends Person{
    private String dator;
//---------------------Constructors---------------------
    public Student(String givenName, String surname, int personnummer, ArrayList<Course> courses, String dator) {
        this.dator = dator;
    }
    public Student(Student source) {
        this.dator = source.dator;
    }
//---------------------Getters--------------------------

    //---------------------Setters--------------------------
//---------------------Metoder--------------------------
    @Override
    public String toString() {
        return givenName + " " + surname;
    }
}
