package sti.aaj.domain;

public class Student extends Person{

    private String name;
    private String surname;
    private String course;

    public Student(String name, String surname, String course) {

        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String toString(){
        return name + " " + surname + " " + course;
    }
    
}
