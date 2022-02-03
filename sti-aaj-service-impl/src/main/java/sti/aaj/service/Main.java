package sti.aaj.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.aaj.domain.Student;
import sti.aaj.domain.Teacher;

import java.util.Scanner;

public class Main { //Vi kunde inte få det att funka när vi hadde Main klassen i service modulen. så vi la den här istället

    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-aaj-service.xml");
    private static StiService stiService = (StiService) applicationContext.getBean("service");

    public static void main(String[] args) {

        stiService.createCourse("Tyska", 10, new Teacher("Özgur", "Kibar", 567890, 10), 1010, 50);
        stiService.createCourse("Svenska", 10, new Teacher("Özgur", "Kibar", 567890, 10), 2020, 40);
        stiService.createCourse("Engelska", 15, new Teacher("Özgur", "Kibar", 567890, 10), 3030, 55);
        stiService.createStudent(10, "Anna", "Karlsson", 1010);

        Scanner scan = new Scanner(System.in);

        while(true){

            try{
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
            } catch (Exception e){
                System.out.println("Something went wrong. Try again.");
            }
        }
    }

    private static void getStudent(int id) {

        Scanner scan = new Scanner(System.in);

        Student student = stiService.getStudent(id);
        System.out.println(stiService.getStudent(id));
        System.out.println("1. Lägg till kurs. ");
        System.out.println("2. Ta bort kurs. ");

        int input = scan.nextInt();

        if(input == 1){
            System.out.println("Lägg till kurs ID(1010, 2020 eller 3030): ");
            int courseId = scan.nextInt();
            stiService.addCourse(student, courseId);
        }
        if(input == 2){
            System.out.println("Ta bort kurs ID(1010, 2020 eller 3030): ");
            int courseId = scan.nextInt();
        }
    }

    private static void createStudent() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv ett ID nummer: ");
        int id = scan.nextInt();

        System.out.println("Skriv förnamn: ");
        String name = scan.next();

        System.out.println("Skriv efternamn: ");
        String surname = scan.next();

        System.out.println("Skriv kurs ID(1010, 2020 eller 3030): ");
        int courseId = scan.nextInt();

        stiService.createStudent(id, name, surname, courseId);
        System.out.println(stiService.getStudent(id));
    }
}