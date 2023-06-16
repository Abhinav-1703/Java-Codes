package pat_3;
import java.util.Scanner;

public class AirlineReservationSystem {
    private static boolean[] seats = new boolean[10]; 
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            System.out.print("Please type 1 for first class or 2 for economy: ");
            int n = input.nextInt();
            
            if (n == 1) {
                int seatNum = assignSeat(true);
                if (seatNum != -1) {
                    printBoardingPass(seatNum, true);
                } else {
                    System.out.println("First class is full. Would you like to be seated in economy? (y/n)");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase("y")) {
                        seatNum = assignSeat(false);
                        if (seatNum != -1) {
                            printBoardingPass(seatNum, false);
                        } else {
                            System.out.println("Next flight arrives in 3 hours.");
                            break;
                        }
                    } else {
                        System.out.println("Next flight arrives in 3 hours.");
                        break;
                    }
                }
            } else if (n == 2) {
                int seatNum = assignSeat(false);
                if (seatNum != -1) {
                    printBoardingPass(seatNum, false);
                } else {
                    System.out.println("Economy is full. Would you like to be seated in first class? (y/n)");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase("y")) {
                        seatNum = assignSeat(true);
                        if (seatNum != -1) {
                            printBoardingPass(seatNum, true);
                        } else {
                            System.out.println("Next flight arrives in 3 hours.");
                            break;
                        }
                    } else {
                        System.out.println("Next flight arrives in 3 hours.");
                        break;
                    }
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static int assignSeat(boolean isFirstClass) {
        int start = isFirstClass ? 0 : 5;
        int end = isFirstClass ? 4 : 9;
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i;
            }
        }
        return -1; 
    }
    
    private static void printBoardingPass(int seatNum, boolean isFirstClass) {
        String section = isFirstClass ? "First Class" : "Economy";
        System.out.println("Boarding Pass:");
        System.out.println("Seat number: " + (seatNum + 1));
        System.out.println("Section: " + section);
    }
}


