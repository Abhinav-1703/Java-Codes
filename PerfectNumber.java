package LFQ12;
import java.util.Scanner;
public class PerfectNumber {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a two-digit number: ");
	        int number = sc.nextInt();

	        int sum = 0;

	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        // Checking if the sum is equal to the number
	        if (sum == number) {
	            System.out.println(number + " is a perfect number.");
	        } else {
	            System.out.println(number + " is not a perfect number.");
	        }
	    }
	}


