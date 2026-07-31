package com.gym.ui;

import javax.swing.*;
import java.awt.*;

public class LoginUI extends JFrame {

    JTextField username;
    JPasswordField password;
    JComboBox<String> role;

    public LoginUI() {

        setTitle("Login");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Username"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password"));
        password = new JPasswordField();
        add(password);

        add(new JLabel("Role"));
        role = new JComboBox<>(new String[]{"Admin", "Trainer", "Member"});
        add(role);

        JButton loginBtn = new JButton("Login");
        add(loginBtn);

        // 🔥 FINAL WORKING LOGIN
        loginBtn.addActionListener(e -> {
            String selectedRole = (String) role.getSelectedItem();

            GymUI ui = new GymUI(selectedRole);
            ui.setVisible(true);   // ⭐ VERY IMPORTANT

            dispose(); // close login window
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); // ⭐ ALSO IMPORTANT
    }
}
//UNIQUE_COMMIT_12345_KUUNAL