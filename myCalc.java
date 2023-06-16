package LFQ12;
import java.util.Scanner;
public class myCalc {
public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	System.out.println("Mini Calculator");
    System.out.println("=====================");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Factorial");
    System.out.println("6. Maximum");
    System.out.println("7. Minimum");
    System.out.print("Select an operation (1-7): ");
	int choice = sc.nextInt();
	System.out.println("enter num1 : ");
	int num1 = sc.nextInt();
	System.out.println("enter num2 : ");
	int num2 = sc.nextInt();
    int ans = 0;
	switch(choice) {
	case 1:
		ans = num1 + num2;
		break;
	case 2:
	    ans = num1 - num2;
	case 3:
		ans = num1*num2 ;
	case 4:
		ans = num1 / num2 ;
	case 5:
		int fact = 1;
        for (int i = 2; i <= num1; i++) {
            fact *= i;
            ans = fact;}
     
    
	
		
	System.out.println("Answer = "+ans);

	
	
	
	}}}
	
	


