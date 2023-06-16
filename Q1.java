package pat4;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();

        if (isValidPassword(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }
	public static boolean isValidPassword(String password) {
	    if (password.length() < 10) {
	        return false;
	    }
	    if (!password.matches("[a-zA-Z0-9]+")) {
	        return false;
	    }
	    int digitCount = 0;
	    for (int i = 0; i < password.length(); i++) {
	        if (Character.isDigit(password.charAt(i))) {
	            digitCount++;
	        }
	    }
	    if (digitCount < 2) {
	        return false;
	    }
	    
	    return true;
	}
}
