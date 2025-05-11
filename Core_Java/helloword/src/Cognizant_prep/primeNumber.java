package Cognizant_prep;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int number = sc.nextInt();
		boolean flag = false;
		if (number == 1) {
			System.out.println("1 is prime number");
		}
		for (int i = 2; i <= (number/2); i++) {
			if (number%i == 0) {
				System.out.println("if true");
				flag = true; 
				break;
			}
		}
		if (flag == true) {
			System.out.println("not prime");
		}else {
			System.out.println(" prime");
		}
	}

}
