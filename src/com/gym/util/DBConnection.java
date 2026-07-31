package com.gym.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gymdb",
                "root",
                "root123" // your password
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}