package sti.aaj.domain;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class Teacher extends Person{
    private int salary;
    //--------------------------Constructors----------------------------------
    public Teacher(String givenName, String surName, int personnummer, int salary){
        this.salary = salary;
        this.courses = new ArrayList<Course>();
    }
    public Teacher(Teacher source){
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

