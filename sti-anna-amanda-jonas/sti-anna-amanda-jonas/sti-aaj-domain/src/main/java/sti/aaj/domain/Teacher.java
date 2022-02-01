package sti.aaj.domain;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class Teacher {
    private String givenName;
    private String surName;
    private int personnummer;
    private ArrayList<Course> courses;
    private int salary;
    //--------------------------Constructors----------------------------------
    public Teacher(String givenName, String surName, int personnummer, int salary){
        this.givenName = givenName;
        this.surName = surName;
        this.personnummer = personnummer;
        this.salary = salary;
        this.courses = new ArrayList<Course>();
    }
    public Teacher(Teacher source){
        this.givenName = source.givenName;
        this.surName= source.surName;
        this.personnummer = source.personnummer;
        this.salary = source.salary;
        this.courses = new ArrayList<Course>(source.courses); //vet ej hur göra klart denna
    }
    //--------------------------Getters----------------------------------------
    public Teacher getSurName() {
        return this.surName;
    }
    public int getNrOfHours() {
        return nrOfHours;
    }
    public int getCourseCode() {
        return courseCode;
    }
    public int getYhPoints() {
        return yhPoints;
    }
    //--------------------------Setters----------------------------------------
    public void setCourse(int index, Course course) {
        courses.set(index, new Course(course));
    }

    //--------------------------Methods----------------------------------------
    public void addCource(Course course){
        courses.add(new Course(course));
    }
}

