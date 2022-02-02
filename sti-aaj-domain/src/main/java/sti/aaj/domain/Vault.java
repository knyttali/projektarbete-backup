package sti.aaj.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vault {
    private static ArrayList<Course> courses;
    private static Map<Integer, Student> students;

    public static void run() {

        courses = new ArrayList<>();
        students = new HashMap();

    }

    public boolean createCourse(Course course){

        return courses.add(course);
    }

    public Student createStudent(int id, Student student) {

        return students.put(id, student);
    }

    public Student getStudent(int id) {

        return students.get(id);
    }
}