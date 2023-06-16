package LFQ12;

import java.util.Scanner;

public class maxnum {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the n : ");
		  int n = sc.nextInt();
		  int maxn = 0;
		  for(int i = 0; i < n; i++) {
			  int num = sc.nextInt();
		      if(num > maxn) {
		    	  maxn = num;
		      }}
	      System.out.println("Largest Number is "+maxn);
		 }}

