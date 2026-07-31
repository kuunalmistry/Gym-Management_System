package com.gym.model;

public class Workout {

    private int workoutId;
    private int memberId;
    private int trainerId;
    private String plan;

    public Workout(int memberId, int trainerId, String plan) {
        this.memberId = memberId;
        this.trainerId = trainerId;
        this.plan = plan;
    }

    public int getMemberId() { return memberId; }
    public int getTrainerId() { return trainerId; }
    public String getPlan() { return plan; }
}