package sti.aaj.service.impl;


import jdk.internal.access.JavaIOFileDescriptorAccess;
import sti.aaj.domain.Course;
import sti.aaj.domain.Student;
import sti.aaj.domain.Teacher;
import sti.aaj.domain.Vault;
import sti.aaj.service.StiService;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements StiService {
    static ArrayList<Student> students;
    static ArrayList<Course> courses;


    public Course createCourse(int yhPoints, Teacher teacher, int courseId, int hours) {
        return null;
    }

    @Override
    public Teacher createTeacher(String name, String surname, int id, int salary) {
        return null;
    }

    @Override
    private static ArrayList<Student> fillStudentList(){

        students.add(new Student("Helena", "Östlund");
        students.add(new Student("Max", "Lundin");
        students.add(new Student("Anna", "Karlsson"));
        return students;
    }
}
