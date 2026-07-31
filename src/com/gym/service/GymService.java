package com.gym.service;

import com.gym.model.Member;

import java.util.ArrayList;

public class GymService {

    // Collection (ArrayList)
    private ArrayList<Member> members = new ArrayList<>();

    // Add member to list
    public void addMember(Member m) {
        members.add(m);
    }

    // Display members
    public void showMembers() {
        for (Member m : members) {
            System.out.println(m.getName());
        }
    }
}