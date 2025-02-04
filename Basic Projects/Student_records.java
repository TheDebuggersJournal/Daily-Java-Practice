package wipropart1day4;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age;
    }
}

public class Student_records {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Update Student by Roll Number");
            System.out.println("5. Delete Student by Roll Number");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        students.add(new Student(rollNumber, name, age));
        System.out.println("Student added successfully.");
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("\nStudent Records:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int rollNumber = scanner.nextInt();
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student Found: " + student);
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    private static void updateStudent() {
        System.out.print("Enter Roll Number to update: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.print("Enter New Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter New Age: ");
                int newAge = scanner.nextInt();
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        int rollNumber = scanner.nextInt();
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                System.out.println("Student record deleted successfully.");
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
}
