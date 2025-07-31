package com.munna.spring.constructor;

public class Employee {
	
	private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

}
