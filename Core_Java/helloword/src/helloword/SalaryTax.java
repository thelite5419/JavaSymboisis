package helloword;

import java.util.Scanner;

public class SalaryTax {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		double salary = sc.nextDouble();
		if (250000>=salary) {
			
			System.out.println("this salary has no tax");
		}
		if (250000<salary && 750000>=salary) {
			double tax = (salary*5)/100;
			System.out.println("this salary has: "+tax+" tax");
		}
		if (750000<salary && 1000000>=salary) {
			double tax = (salary*10)/100;
			System.out.println("this salary has: "+tax+" tax");
		}
		if (1000000<salary && 1500000>=salary) {
			double tax = (salary*20)/100;
			System.out.println("this salary has: "+tax+" tax");
		}
		if (1500000<salary) {
			double tax = (salary*30)/100;
			System.out.println("this salary has: "+tax+" tax");
		}
	}
}
