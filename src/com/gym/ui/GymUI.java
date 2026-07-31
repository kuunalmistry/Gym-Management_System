package com.gym.ui;

import com.gym.util.DBConnection;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class GymUI extends JFrame {

    JTextField idField, nameField, ageField, phoneField, typeField;
    JTextField trainerNameField, specializationField;
    JTextField trainerIdField, workoutField;

    DefaultTableModel tableModel;
    String role;

    Color bg = new Color(30, 30, 30);
    Color panelBg = new Color(45, 45, 45);
    Color accent = new Color(0, 150, 255);

    public GymUI(String role) {

        this.role = role;

        setTitle("Gym Management System - " + role);
        setSize(950, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("GYM MANAGEMENT SYSTEM (" + role + ")", JLabel.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        title.setForeground(accent);
        title.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(title, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(panelBg);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);

        idField = createField();
        nameField = createField();
        ageField = createField();
        phoneField = createField();
        typeField = createField();

        trainerNameField = createField();
        specializationField = createField();
        trainerIdField = createField();
        workoutField = createField();

        addField(formPanel, gbc, 0, "ID:", idField);
        addField(formPanel, gbc, 1, "Name:", nameField);
        addField(formPanel, gbc, 2, "Age:", ageField);
        addField(formPanel, gbc, 3, "Phone:", phoneField);
        addField(formPanel, gbc, 4, "Membership:", typeField);
        addField(formPanel, gbc, 5, "Trainer Name:", trainerNameField);
        addField(formPanel, gbc, 6, "Specialization:", specializationField);
        addField(formPanel, gbc, 7, "Trainer ID:", trainerIdField);
        addField(formPanel, gbc, 8, "Workout Plan:", workoutField);

        add(formPanel, BorderLayout.WEST);

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "Name", "Age", "Phone", "Membership"});

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(9, 1, 10, 10));

        JButton addBtn = createButton("➕ Add Member", e -> addMember());
        JButton viewBtn = createButton("📄 View Members", e -> loadMembers());
        JButton updateBtn = createButton("✏ Update", e -> updateMember());
        JButton deleteBtn = createButton("❌ Delete", e -> deleteMember());
        JButton searchBtn = createButton("🔍 Search", e -> searchMember());

        JButton addTrainerBtn = createButton("👨‍🏫 Add Trainer", e -> addTrainer());
        JButton viewTrainerBtn = createButton("👨‍🏫 View Trainers", e -> loadTrainers());

        JButton assignWorkoutBtn = createButton("🏋 Assign Workout", e -> assignWorkout());
        JButton viewWorkoutBtn = createButton("🏋 View Workouts", e -> loadWorkouts());

        buttonPanel.add(addBtn);
        buttonPanel.add(viewBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(deleteBtn);
        buttonPanel.add(searchBtn);
        buttonPanel.add(addTrainerBtn);
        buttonPanel.add(viewTrainerBtn);
        buttonPanel.add(assignWorkoutBtn);
        buttonPanel.add(viewWorkoutBtn);

        add(buttonPanel, BorderLayout.EAST);

        // ROLE CONTROL
        if (role.equals("Member")) {
            addTrainerBtn.setVisible(false);
            viewTrainerBtn.setVisible(false);
        }

        if (role.equals("Trainer")) {
            addBtn.setVisible(false);
            viewBtn.setVisible(false);
            updateBtn.setVisible(false);
            deleteBtn.setVisible(false);
            searchBtn.setVisible(false);
        }
    }

    private JTextField createField() {
        JTextField field = new JTextField(10);
        field.setBackground(new Color(60, 60, 60));
        field.setForeground(Color.WHITE);
        field.setCaretColor(Color.WHITE);
        field.setBorder(BorderFactory.createLineBorder(accent));
        return field;
    }

    private void addField(JPanel panel, GridBagConstraints gbc, int y, String label, JTextField field) {
        gbc.gridx = 0;
        gbc.gridy = y;

        JLabel lbl = new JLabel(label);
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Segoe UI", Font.BOLD, 13));

        panel.add(lbl, gbc);

        gbc.gridx = 1;
        panel.add(field, gbc);
    }

    private JButton createButton(String text, java.awt.event.ActionListener action) {
        JButton btn = new JButton(text);
        btn.addActionListener(action);
        return btn;
    }

    private void addMember() {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO members (name, age, phone, membership_type) VALUES (?, ?, ?, ?)"
            );

            ps.setString(1, nameField.getText());
            ps.setInt(2, Integer.parseInt(ageField.getText()));
            ps.setString(3, phoneField.getText());
            ps.setString(4, typeField.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Member Added");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadMembers() {
        loadTable("SELECT * FROM members");
    }

    private void searchMember() {
        loadTable("SELECT * FROM members WHERE name LIKE '%" + nameField.getText() + "%'");
    }

    private void updateMember() {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE members SET name=?, age=?, phone=?, membership_type=? WHERE member_id=?"
            );

            ps.setString(1, nameField.getText());
            ps.setInt(2, Integer.parseInt(ageField.getText()));
            ps.setString(3, phoneField.getText());
            ps.setString(4, typeField.getText());
            ps.setInt(5, Integer.parseInt(idField.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void deleteMember() {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM members WHERE member_id=?");

            ps.setInt(1, Integer.parseInt(idField.getText()));
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadTable(String query) {
        try {
            tableModel.setRowCount(0);
            Connection conn = DBConnection.getConnection();
            ResultSet rs = conn.prepareStatement(query).executeQuery();

            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addTrainer() {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO trainers (name, specialization) VALUES (?, ?)"
            );

            ps.setString(1, trainerNameField.getText());
            ps.setString(2, specializationField.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Trainer Added");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadTrainers() {
        loadTable("SELECT * FROM trainers");
    }

    private void assignWorkout() {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO workouts (member_id, trainer_id, plan) VALUES (?, ?, ?)"
            );

            ps.setInt(1, Integer.parseInt(idField.getText()));
            ps.setInt(2, Integer.parseInt(trainerIdField.getText()));
            ps.setString(3, workoutField.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Workout Assigned");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadWorkouts() {
        loadTable("SELECT * FROM workouts");
    }

    public static void main(String[] args) {
        new LoginUI();
    }
}
// UNIQUE_COMMIT_67890_<Manvith Rai>_WORKOUT_MODULE
