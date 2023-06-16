package LFQ12;

import java.util.Scanner;

class EmpData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        double[] salaries = new double[10];
        String[] datesOfJoining = new String[10];

        // Input employee details
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Salary: ");
            salaries[i] = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            System.out.print("Date of Joining: ");
            datesOfJoining[i] = sc.nextLine();
            System.out.println();
        }

        // Calculate average salary
        double totalSalary = 0;
        for (double salary : salaries) {
            totalSalary += salary;
        }
        double averageSalary = totalSalary / salaries.length;

        // Print employee details
        System.out.println("Employee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Salary: " + salaries[i]);
            System.out.println("Date of Joining: " + datesOfJoining[i]);
            System.out.println();
        }

        // Print average salary
        System.out.println("Average Salary: " + averageSalary);
    }
}
