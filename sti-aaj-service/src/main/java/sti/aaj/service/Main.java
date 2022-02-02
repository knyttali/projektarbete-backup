package sti.aaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.aaj.domain.Teacher;
import sti.aaj.domain.Vault;
import java.util.Scanner;

public class Main {

    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-aaj-service-impl.xml");
    private static StiService stiService;

    public static void main(String[] args) {

        stiService = (StiService) applicationContext.getBean("service");
        stiService.createCourse("Tyska", 10, new Teacher("Özgur", "Kibar", 567890, 10), 2020, 50);
        stiService.createCourse("Svenska", 10, new Teacher("Özgur", "Kibar", 567890, 10), 2030, 40);
        stiService.createCourse("Engelska", 15, new Teacher("Özgur", "Kibar", 567890, 10), 1010, 55);

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("------MENY-----");
            System.out.println("1. Hämta student. ");
            System.out.println("2. Lägg till student. ");
            System.out.println("3. Stäng programmet. ");

            int input = scan.nextInt();

            if(input == 1) {
                System.out.println("Skriv ID nummer: ");
                int id = scan.nextInt();
                getStudent(id);
            }
            else if (input == 2){
                createStudent();
            }
            else if (input == 3){
                break;
            }
        }
    }

    private static void getStudent(int id) {
        stiService.getStudent(id);
    }

    private static void createStudent() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv ett ID nummer: ");
        int id = scan.nextInt();

        System.out.println("Skriv förnamn: ");
        String name = scan.next();

        System.out.println("Skriv efternamn: ");
        String surname = scan.next();

        System.out.println("Skriv kurs ID: ");
        int courseId = scan.nextInt();

        stiService.createStudent(id, name, surname, courseId);
    }
}
