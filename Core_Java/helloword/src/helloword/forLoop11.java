package helloword;

import java.util.Scanner;

public class forLoop11 {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		if (number == 1) {
			System.out.println("1 can not be prime number");
			System.exit(0);
		}
		for (int i = 2; i  <= number/2; i++) {
			if (number%i == 0) {
		
				flag = true; 
				break;
			}
		}
		
		
		if (flag==true) {
			System.out.println("it is not prime Number");
		}
		else {
			System.out.println("it it prime");
		}
		
		
	}
}
