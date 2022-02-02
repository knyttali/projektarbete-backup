package sti.aaj.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vault {
    private static ArrayList<Course> courses = new ArrayList<>();
    private static Map<Integer, Student> students = new HashMap();


    public static boolean createCourse(Course course){

        return courses.add(course);
    }

    public static Student createStudent(int id, Student student) {

        return students.put(id, student);
    }

    public static Student getStudent(int id) {

        return students.get(id);
    }
}