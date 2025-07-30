package com.munna.spring.setter;

public class Address {
	
	private String city;
    private String state;

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void display() {
        System.out.println("Address: " + city + ", " + state);
        
    }

}
