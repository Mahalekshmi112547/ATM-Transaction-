/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainn;
import java.util.*;

public class Mainn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> students = new ArrayList<>();
        List<Integer> marks = new LinkedList<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT GRADE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Students");
            System.out.println("2. Display Students");
            System.out.println("3. Display Marks");
            System.out.println("4. Display Grades");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter number of students: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        System.out.println("\nStudent " + (i + 1));

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter marks: ");
                        int mark = sc.nextInt();
                        sc.nextLine();

                        students.add(name);
                        marks.add(mark);
                    }

                    System.out.println("\nAll students added successfully.");
                    break;

                case 2:

                    System.out.println("\nStudents:");

                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(
                            (i + 1) + ". " + students.get(i)
                        );
                    }

                    break;

                case 3:

                    System.out.println("\nMarks:");

                    for (int i = 0; i < marks.size(); i++) {
                        System.out.println(
                            students.get(i) + " - " + marks.get(i)
                        );
                    }

                    break;

                case 4:

                    System.out.println("\nGrades:");

                    for (int i = 0; i < marks.size(); i++) {

                        int mark = marks.get(i);
                        String grade;

                        if (mark >= 90) {
                            grade = "A";
                        } else if (mark >= 80) {
                            grade = "B";
                        } else if (mark >= 70) {
                            grade = "C";
                        } else if (mark >= 60) {
                            grade = "D";
                        } else {
                            grade = "F";
                        }

                        System.out.println(
                            students.get(i) + " - " + mark + " - " + grade
                        );
                    }

                    break;

                case 5:

                    System.out.print("Enter student name: ");
                    String search = sc.nextLine();

                    if (students.contains(search)) {

                        int index = students.indexOf(search);

                        System.out.println(
                            "Name: " + students.get(index)
                        );

                        System.out.println(
                            "Marks: " + marks.get(index)
                        );

                    } else {

                        System.out.println("Student not found.");
                    }

                    break;

                case 6:

                    System.out.println(
                        "Thank you for using the Student Grade Management System."
                    );
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}