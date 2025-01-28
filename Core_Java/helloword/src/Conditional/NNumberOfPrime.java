package Conditional;

import java.util.Scanner;

public class NNumberOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbe till you want prime number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int number = 1; number < 100; number++) {
			boolean flag = false;
			for (int i = 2; i  <= number/2; i++) {
				if (number%i == 0) {
					flag = true;
				}
			}
			if (flag != true) {
				System.out.print(number+"	");
				a--;
				if (a == 0) {
					break;
				}
			}
		}
	}

}
