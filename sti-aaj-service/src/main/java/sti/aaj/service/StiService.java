package sti.aaj.service;

import sti.aaj.domain.Course;
import sti.aaj.domain.Student;
import sti.aaj.domain.Teacher;
import sti.aaj.domain.Vault;

public interface StiService {

    Course createCourse();
    Teacher createTeacher();
    Student createStudent();

}
