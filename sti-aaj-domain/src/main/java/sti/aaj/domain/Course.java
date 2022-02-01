package sti.aaj.domain;

public class Course {

    private int yhPoints;
    private Teacher teacher;
    private int courseId;
    private int hours;
    private String kursNamn;


    public Course(String kursNamn, int yhPoints, Teacher teacher, int courseId, int hours) {

        setKursNamn(kursNamn);
        setCourseId(courseId);
        setHours(hours);
        setTeacher(teacher);
        setYhPoints(yhPoints);
    }

    private void setKursNamn(String kursNamn) {
        this.kursNamn = kursNamn;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setYhPoints(int yhPoints) {
        this.yhPoints = yhPoints;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getHours() {
        return hours;
    }

    public int getYhPoints() {
        return yhPoints;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getKursNamn() {
        return kursNamn;
    }

    public String toString(){
        return "\n" + " Kurs namn: " + kursNamn + " Kurs ID: " + courseId + " YH poäng: " + yhPoints + " Lärare: " + teacher.getName() + " Timmar " + hours;
    }

}