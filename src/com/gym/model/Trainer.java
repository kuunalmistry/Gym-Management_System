package com.gym.model;

public class Trainer extends User {

    private int trainerId;
    private String specialization;

    public Trainer(String name, int age, String phone, String specialization) {
        super(name, age, phone);
        this.specialization = specialization;
    }

    // Getters
    public int getTrainerId() { return trainerId; }
    public String getSpecialization() { return specialization; }

    // Setter (for encapsulation)
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Polymorphism (method overriding)
    @Override
    public void displayRole() {
        System.out.println("I am a Trainer: " + name);
    }
}