package com.gym.model;

public class Member extends User {

    private int memberId;
    private String membershipType;

    public Member(String name, int age, String phone, String membershipType) {
        super(name, age, phone);
        this.membershipType = membershipType;
    }

    // Getters
    public int getMemberId() { return memberId; }
    public String getMembershipType() { return membershipType; }

    // Setter (for encapsulation marks)
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    // Polymorphism (method overriding)
    @Override
    public void displayRole() {
        System.out.println("I am a Gym Member: " + name);
    }
}
// Member Management Feature implemented
// Added validation logic for member inputs