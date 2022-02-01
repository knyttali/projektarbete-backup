package sti.aaj.domain;

import org.jetbrains.annotations.NotNull;

public class Course {
    private int yhPoints;
    private Teacher teacher;
    private int courseCode;
    private int nrOfHours;
    //--------------------------Constructors----------------------------------
    public Course(int yhPoints, Teacher teacher, int courseCode, int nrOfHours){
        this.yhPoints = yhPoints;
        this.teacher = teacher;
        this.courseCode = courseCode;
        this.nrOfHours = nrOfHours;
    }
    public Course(Course source){
        this.yhPoints = source.yhPoints;
        this.teacher = source.teacher;
        this.courseCode = source.courseCode;
        this.nrOfHours = source.nrOfHours;
    }
    //--------------------------Getters----------------------------------------
    public Teacher getTeacher() {
        return teacher;
    }
    public int getNrOfHours() {
        return nrOfHours;
    }
    public int getCourseCode() {
        return courseCode;
    }
    public int getYhPoints() {
        return yhPoints;
    }
    //--------------------------Setters----------------------------------------
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void setNrOfHours(int nrOfHours) {
        this.nrOfHours = nrOfHours;
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    public void setYhPoints(int yhPoints) {
        this.yhPoints = yhPoints;
    }
    //--------------------------Methods----------------------------------------


}
