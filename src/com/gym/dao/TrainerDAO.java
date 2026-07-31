package com.gym.dao;

import com.gym.model.Trainer;
import com.gym.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class TrainerDAO {

    public void addTrainer(Trainer trainer) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO trainers(name, specialization) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, trainer.getName());
            ps.setString(2, trainer.getSpecialization());

            ps.executeUpdate();
            System.out.println("Trainer Added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Trainer> getAllTrainers() {
        ArrayList<Trainer> list = new ArrayList<>();

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT * FROM trainers";
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                // ✅ CREATE OBJECT PROPERLY
                Trainer t = new Trainer(
                        rs.getString("name"),
                        0,
                        "0000000000",
                        rs.getString("specialization")
                );

                // ✅ ADD TO LIST
                list.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}