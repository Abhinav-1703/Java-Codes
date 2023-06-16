package LFQ12;

import java.util.Scanner;

public class bmi {

    private String name;
    private double weight;
    private double height;
    private double BMI;

    public bmi(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.BMI = weight / (height * height);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI() {
        return BMI;
    }

    public boolean isHealthy() {
        return BMI < 25;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the human: ");
        String name = scanner.next();
        System.out.println("Enter the weight of the human: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter the height of the human: ");
        double height = scanner.nextDouble();

        bmi human = new bmi(name, weight, height);

        if (human.isHealthy()) {
            System.out.println(human.getName() + " is healthy.");
        } else {
            try {
                throw new BMIException("BMI is greater than 25.");
            } catch (BMIException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class BMIException extends Exception {

    public BMIException(String message) {
        super(message);
    }
}
