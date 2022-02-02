package sti.aaj.domain;

import java.util.ArrayList;

public class Student extends Person{

    private String name;
    private String surname;
    private int id;
    private ArrayList<Course> courses;
    private int courseId;

    public Student(String name, String surname, int id, int courseId) {

        this.name = name;
        this.surname = surname;
        this.id = id;
        this.courseId = courseId;
    }

    public String toString() {
        StringBuilder courseName = new StringBuilder("");
        for (Course course : courses) {
            courseName.append(course.getCourseName()).append(",");

        }
        return name + " " + surname + " " + courseName + "\n";
    }
}
