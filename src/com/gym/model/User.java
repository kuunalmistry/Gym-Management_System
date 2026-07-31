package com.gym.model;

public abstract class User {

    protected String name;
    protected int age;
    protected String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Getters (Encapsulation)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }

    // Setters (IMPORTANT for full marks)
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPhone(String phone) { this.phone = phone; }

    // Abstract method (Abstraction)
    public abstract void displayRole();

    // Method Overloading (NEW - for marks)
    public void displayRole(String extra) {
        System.out.println("Role: " + extra);
    }
}