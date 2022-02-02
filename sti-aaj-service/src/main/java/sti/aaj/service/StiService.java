package sti.aaj.service;

import sti.aaj.domain.Course;
import sti.aaj.domain.Student;
import sti.aaj.domain.Teacher;
import sti.aaj.domain.Vault;

import java.util.ArrayList;

public interface StiService {

    ArrayList<Course> fillCoursesList();


    Course createCourse(int yhPoints , Teacher teacher, int courseId, int hours);
    Teacher createTeacher(String name, String surname, int id, int salary);
    Student fillStudentList();

}
