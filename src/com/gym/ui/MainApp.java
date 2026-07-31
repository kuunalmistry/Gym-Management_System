package com.gym.ui;

import com.gym.dao.MemberDAO;
import com.gym.model.Member;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDAO dao = new MemberDAO();

        while (true) {
            System.out.println("\n===== Gym Management System =====");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Update Member");
            System.out.println("4. Delete Member");
            System.out.println("5. Search Member");   // ✅ added
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter membership type: ");
                    String type = sc.nextLine();

                    dao.addMember(new Member(name, age, phone, type));
                    break;

                case 2:
                    dao.viewMembers();
                    break;

                case 3:
                    System.out.print("Enter Member ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new phone: ");
                    String newPhone = sc.nextLine();

                    System.out.print("Enter new membership type: ");
                    String newType = sc.nextLine();

                    dao.updateMember(id, newName, newAge, newPhone, newType);
                    break;

                case 4:
                    System.out.print("Enter Member ID to delete: ");
                    int deleteId = sc.nextInt();

                    dao.deleteMember(deleteId);
                    break;

                case 5:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();

                    dao.searchMember(searchName);
                    break;

                case 6:
                    System.out.println("Exiting... 👋");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice ❌");
            }
        }
    }
}