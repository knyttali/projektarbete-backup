package sti.aaj.domain;

import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<Course> courses;
    private int courseId; //behövs denna?

    public Student(String name, String surname, int id, int courseId) {
        super(name, surname, id);
        this.courses = new ArrayList<>();
        this.courseId = courseId;
        setCourse(courseId);
    }
    public Student(Student source){
        super(source);
        this.courses = new ArrayList<>();
        this.courseId = source.courseId;
        setCourse(source.courseId);
    }

    public void setCourse(int courseId){
        courses.add(Vault.getCourse(courseId));
    }


    public String toString() {
        StringBuilder courseName = new StringBuilder();
        String komma = "";
        for (int i = 0; i < courses.size(); i++) {
            if(i < courses.size()-1){
                komma = ", ";
            } else {komma = " ";}
            courseName.append(courses.get(i).getCourseName()).append(komma);
        }
        return "Student: " + this.getFullName() + "\nKurser: " + courseName + "\n";
    }
}
