package sti.aaj.domain;

import org.jetbrains.annotations.NotNull;

public class Course {

    private int yhPoints;

    public Course(int yhPoints , Teacher teacher, int courseId, int hours) {
        setYhPoints(yhPoints);
    }

    public Course(Course course) {
    }

    private void setYhPoints(int yhPoints) {
        this.yhPoints = yhPoints;
    }
}