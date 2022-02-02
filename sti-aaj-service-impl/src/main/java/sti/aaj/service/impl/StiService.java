package sti.aaj.service.impl;
import sti.aaj.domain.Course;
import sti.aaj.domain.Student;
import sti.aaj.domain.Teacher;
import sti.aaj.service.IStiService;
import java.util.ArrayList;

public class StiService implements IStiService {
    private static ArrayList<Student> students;
    private static ArrayList<Course> courses;
    private static Teacher teacher1;
    private static Teacher teacher2;
    private static Teacher teacher3;

    public Student createStudent(String name, String surname, int id, ArrayList<Course> courses){
        Student student = new Student(name, surname, id, courses);
        return student;
    }
    @Override
    public Course createCourse(String kursNamn, int yhPoints, Teacher teacher, int courseId, int hours) {
        Course course = new Course(kursNamn, yhPoints, teacher, courseId, hours);
        return course;
    }

    @Override
    public Teacher createTeacher(String name, String surname, int id, int salary) {
        Teacher teacher = new Teacher(name, surname, id, salary);
        return teacher;
    }

    @Override
    public ArrayList<Student> fillStudentList(){
        students.add(new Student("Helena", "Östlund", 1234, courses));
        students.add(new Student("Max", "Lundin", 2345, courses));
        students.add(new Student("Anna", "Karlsson", 3456, courses));
        return students;
    }


    @Override
    public ArrayList<Course> fillCoursesList(String kursNamn, int yhPoints, Teacher teacher, int courseId, int hours){
        courses.add(new Course("JavaA", 20, teacher1, 1, 160));
        courses.add(new Course("JavaB", 25, teacher2, 2, 200));
        courses.add(new Course("JavaScript", 20, teacher3, 3, 160));
        return courses;
    }



}
