package helloword;

import java.util.Scanner;

public class quadraticEquation {
	public static void main(String[] args) {
		System.out.println("Enter the values of A, B, C:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double p = Math.sqrt((b*b)-(4*a*c));
		System.out.println(p);
		double x1 = ((-b+p)/(2*a));
		double x2 = ((-b-p)/(2*a));
		System.out.println("the values of X1 is :"+x1+ " the values of X2 is :"+x2);
	}
	
}
