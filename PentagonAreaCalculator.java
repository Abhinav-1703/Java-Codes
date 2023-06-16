package pat4;
import java.util.Scanner;

public class PentagonAreaCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of one side of the pentagon: ");
        double sideLength = scanner.nextDouble();
        double area = calculatePentagonArea(sideLength);
        System.out.println("The area of the pentagon is: " + area);
        
        scanner.close();
    }
    
    public static double calculatePentagonArea(double sideLength) {
        double apothemLength = sideLength / (2 * Math.tan(Math.PI / 5));
        
        double perimeter = 5 * sideLength;
        
        double area = (perimeter * apothemLength) / 2;
        
        return area;
    }
}


