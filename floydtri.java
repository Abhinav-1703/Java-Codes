package LFQ12;


	import java.util.Scanner;

	class floydtri {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number of rows for Floyd's Triangle: ");
		        int rows = sc.nextInt();

		        int number = 1;
		        System.out.println("Floyd's Triangle:");
		        System.out.println(number);
		        for (int i = 1; i < rows; i++) {
		            number++;
		        	for (int j = 1; j <= i; j++) {
		                System.out.print(number + " ");
		                
		            }
		        	System.out.println();
		        }
		    }
		}
