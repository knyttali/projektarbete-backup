package sti.aaj.service.impl;


import sti.aaj.domain.Course;
import sti.aaj.domain.Student;
import sti.aaj.domain.Teacher;
import sti.aaj.service.StiService;

import java.util.ArrayList;

public class ServiceImpl implements StiService {
    static ArrayList<Course> courses;
    static Teacher teacher1;
    static Teacher teacher2;
    static Teacher teacher3;


    public Course createCourse(int yhPoints, Teacher teacher, int courseId, int hours) {
        return null;
    }

    @Override
    public Teacher createTeacher(String name, String surname, int id, int salary) {
        return null;
    }

    @Override
    public ArrayList<Course> fillCoursesList(){

        courses.add(new Course("JavaA", 20, teacher1, 1, 160));
        courses.add(new Course("JavaB", 25, teacher2, 2, 200));
        courses.add(new Course("JavaScript", 20, teacher3, 3, 160));
        return courses;
    }
}
