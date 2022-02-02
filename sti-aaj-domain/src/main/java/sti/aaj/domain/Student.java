package sti.aaj.domain;

import java.util.ArrayList;

public class Student extends Person{

    private String name;
    private String surname;
    private ArrayList<Course> courses; //Gör detta till en lista. Man ska kunna ta undan och lägga till kurser.

    public Student(String name, String surname, int personnummer, ArrayList<Course> courses) {

        this.name = name;
        this.surname = surname;
        this.courses = courses;
    }

    public String toString(){
        StringBuilder kursNamn = new StringBuilder("");
        for (Course course: courses) {
            kursNamn.append( course.getKursNamn()).append(",");

        }
        return name + " " + surname + " " + kursNamn + "\n";
    }
    
}
