package org.example;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int lengthOfService;

    public Employee(int id, String firstName, String lastName, int lengthOfService) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lengthOfService = lengthOfService;
    }

    public int getIdd() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getLengthOfService() {
        return lengthOfService;
    }
}
