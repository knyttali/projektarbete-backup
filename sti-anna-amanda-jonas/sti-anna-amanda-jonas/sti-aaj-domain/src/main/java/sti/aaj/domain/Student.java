package sti.aaj.domain;

import java.util.ArrayList;

public class Student {
    private String givenName;
    private String surname;
    private int personnummer;
    private ArrayList<Course> courses;
    private String dator;
//---------------------Constructors---------------------
    public Student(String givenName, String surname, int personnummer, ArrayList<Course> courses, String dator) {
        this.givenName = givenName;
        this.surname = surname;
        this.personnummer = personnummer;
        this.dator = dator;
        this.courses = new ArrayList<Course>();
    }
    public Student(Student source) {
        this.givenName = source.givenName;
        this.surname = source.surname;
        this.personnummer = source.personnummer;
        this.dator = source.dator;
        this.courses = source.courses;
    }
//---------------------Getters--------------------------
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getSurname() {
        return surname;
    }
    public int getPersonnummer() {
        return personnummer;
    }
    public Course getCourse(int index) {
        return new Course(courses.get(index));
    }

    //---------------------Setters--------------------------
    public void setSurname(String surname) {
        this.surname = surname;
    }
//---------------------Metoder--------------------------
    @Override
    public String toString() {
        return givenName + " " + surname;
    }
}
