package net.javaguides.springboot.bean;

import org.springframework.stereotype.Component;

/**
 * tell Spring that this class is a bean,
 * so Spring will automatically detect it
 * and register it in the application context.
 */
@Component
public class Student {
    private int id;
    private String firstName;
    private String lastName;

    public Student() {

    }

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
