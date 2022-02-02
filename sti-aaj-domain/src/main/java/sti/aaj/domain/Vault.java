package sti.aaj.domain;
import sti.aaj.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Vault {

        
    public static void run() {

        Scanner scan = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<>();
        HashMap<Integer, Student> students = new HashMap();
        
        courses.add(new Course("Svenska",10, new Teacher("Özgur", "Kibar", 567890, 10), 2020, 50));
        courses.add(new Course("Engelska", 20, new Teacher("Stefan", "Holm", 123456, 15), 1010, 30));

        students.put(1234, new Student("Jonas", "Wadin",4567, courses));

        System.out.println("Write ID number: ");
        int id = scan.nextInt();

        System.out.println(students.get(id));
    }
}