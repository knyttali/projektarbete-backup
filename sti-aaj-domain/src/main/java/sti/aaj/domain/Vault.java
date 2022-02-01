package sti.aaj.domain;

import java.util.ArrayList;

public class Vault {

        
    public static void run() {

        ArrayList<Course> courses = new ArrayList<>();
        
        courses.add(new Course(10, new Teacher("Özgur", "Kibar", 567890, 10), 2020, 50));
        courses.add(new Course(20, new Teacher("Stefan", "Holm", 123456, 15), 1010, 30));

        System.out.println(courses);
    }
}