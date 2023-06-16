package LFQ12;

import java.util.Scanner;

public class palnd {
public static void main(String[] args) {	
	System.out.println("Enter the input string : ");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	Boolean ifpal = true;
	int len = str.length();
	for(int i = 0; i < len ; i++) {
	   if(str.charAt(i) != str.charAt(len - 1 - i)) {
		   ifpal = false;
		   break;}}
	if(ifpal) {
		System.out.println("Yes palindrome detected");}
	else {
		System.out.println("No palindrome detected");}
		
	}}

	
	
	   
	   
	   
	
	
	


