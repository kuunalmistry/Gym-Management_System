package com.gym.dao;

import com.gym.model.Workout;
import com.gym.util.DBConnection;

import java.sql.*;

public class WorkoutDAO {

    public void addWorkout(Workout w) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO workouts(member_id, trainer_id, plan) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, w.getMemberId());
            ps.setInt(2, w.getTrainerId());
            ps.setString(3, w.getPlan());

            ps.executeUpdate();
            System.out.println("Workout Assigned!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}