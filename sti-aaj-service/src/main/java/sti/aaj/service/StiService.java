package sti.aaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import sti.aaj.domain.Course;
import sti.aaj.domain.Student;
import sti.aaj.domain.Teacher;
import sti.aaj.domain.Vault;

import java.util.ArrayList;

public interface StiService {

    Course createCourse(String courseName, int yhPoints , Teacher teacher, int courseId, int hours);
    Teacher createTeacher(String name, String surname, int id, int salary);
    Student getStudent(int id);
    Student createStudent(int id, String name, String surname, int courseId);
}
