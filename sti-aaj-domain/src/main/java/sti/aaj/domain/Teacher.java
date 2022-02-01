package sti.aaj.domain;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class Teacher extends Person{

    private String name;

    public Teacher(String name, String surname, int id, int salary) {

        setName(name);
        setSurname(surname);
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private void setName(String name) {

        this.name = name;
    }


    public String getName() {

        return name + " " + surname;
    }
}

