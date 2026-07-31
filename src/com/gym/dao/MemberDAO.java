package com.gym.dao;

import com.gym.model.Member;
import com.gym.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

    // 🔹 INSERT (Add Member)
    public void addMember(Member member) {
        try {
            Connection conn = DBConnection.getConnection();

            String query = "INSERT INTO members (name, age, phone, membership_type) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, member.getName());
            ps.setInt(2, member.getAge());
            ps.setString(3, member.getPhone());
            ps.setString(4, member.getMembershipType());

            ps.executeUpdate();

            System.out.println("Member added successfully ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 READ (View Members)
    public void viewMembers() {
        try {
            Connection conn = DBConnection.getConnection();

            String query = "SELECT * FROM members";
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("member_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("phone") + " | " +
                        rs.getString("membership_type")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 SEARCH (Search Member by Name)
    public void searchMember(String searchName) {
        try {
            Connection conn = DBConnection.getConnection();

            String query = "SELECT * FROM members WHERE name LIKE ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + searchName + "%");

            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;
                System.out.println(
                        rs.getInt("member_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("phone") + " | " +
                        rs.getString("membership_type")
                );
            }

            if (!found) {
                System.out.println("No member found ❌");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 UPDATE (Update Member)
    public void updateMember(int id, String name, int age, String phone, String membershipType) {
        try {
            Connection conn = DBConnection.getConnection();

            String query = "UPDATE members SET name=?, age=?, phone=?, membership_type=? WHERE member_id=?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, phone);
            ps.setString(4, membershipType);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Member updated successfully ✅");
            } else {
                System.out.println("Member not found ❌");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 DELETE (Delete Member)
    public void deleteMember(int id) {
        try {
            Connection conn = DBConnection.getConnection();

            String query = "DELETE FROM members WHERE member_id = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Member deleted successfully ✅");
            } else {
                System.out.println("Member not found ❌");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}