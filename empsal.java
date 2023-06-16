package LFQ12;

import java.util.Scanner;

class Employee {
	int salary;
	public Employee(int salary) {
		this.salary = salary;}
	public void displaySal() {
		System.out.println("Empsal : "+salary);}}
		
class Teaching extends Employee{
	protected int exal;
	public Teaching(int salary, int exal) {
		super(salary);
		this.exal = exal;}
    public void displaySal() {
		System.out.println("Empsal : "+(salary+exal));}}

class Nont extends Employee{
	int bonus;
	public Nont(int salary, int bonus) {
		super(salary);
		this.bonus = bonus;}
	public void displaySal() {
		System.out.println("Empsal : "+(salary+bonus));}}
		
class empsal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee salary");
		int sal = sc.nextInt();
		Employee employee = new Employee(sal);
		employee.displaySal();
		System.out.println("Enter teacher salary");
		int tsal = sc.nextInt();
		System.out.println("Extra Allowances");
		int exall = sc.nextInt();
		Teaching teaching = new Teaching(tsal,exall);
		teaching.displaySal();
		System.out.println("Enter ntsalary");
		int ntsal = sc.nextInt();
		System.out.println("Enter bonus");
		int bon = sc.nextInt();
		Nont nt = new Nont(ntsal,bon);
		nt.displaySal();
		
		
		
				
	}
	
}
				
		

