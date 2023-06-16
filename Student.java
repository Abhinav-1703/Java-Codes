package LFQ12;

import java.util.Scanner;

public class Student {

    private String rollNumber;
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;
    private int totalMarks;

    public Student(String rollNumber, int subject1Marks, int subject2Marks, int subject3Marks) {
        this.rollNumber = rollNumber;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.totalMarks = subject1Marks + subject2Marks + subject3Marks;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getSubject1Marks() {
        return subject1Marks;
    }

    public int getSubject2Marks() {
        return subject2Marks;
    }

    public int getSubject3Marks() {
        return subject3Marks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of students
        Student[] students = new Student[8];

        // Get the roll number, marks of 3 subjects from user for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the roll number of student " + (i + 1) + ": ");
            String rollNumber = scanner.next();
            System.out.println("Enter the marks of subject 1 for student " + (i + 1) + ": ");
            int subject1Marks = scanner.nextInt();
            System.out.println("Enter the marks of subject 2 for student " + (i + 1) + ": ");
            int subject2Marks = scanner.nextInt();
            System.out.println("Enter the marks of subject 3 for student " + (i + 1) + ": ");
            int subject3Marks = scanner.nextInt();

            // Create a new student object and add it to the array
            students[i] = new Student(rollNumber, subject1Marks, subject2Marks, subject3Marks);
        }

        // Find the topper
        Student topper = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getTotalMarks() > topper.getTotalMarks()) {
                topper = students[i];
            }
        }

        // Print the roll number and average marks of all students
        System.out.println("Roll Number | Subject 1 | Subject 2 | Subject 3 | Average Marks");
        for (Student student : students) {
            System.out.printf("%-10s | %-10d | %-10d | %-10d | %-10d\n",
                    student.getRollNumber(), student.getSubject1Marks(), student.getSubject2Marks(), student.getSubject3Marks(), student.getTotalMarks() / 3);
        }

        // Print the topper's roll number and total marks
        System.out.println("Topper's roll number is " + topper.getRollNumber() + " and total marks is " + topper.getTotalMarks());
    }
}
