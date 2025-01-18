package helloword;

import java.util.Scanner;

public class UserChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Choose c = new Choose();
		
		System.out.println("enter any numbers");
		int a = sc.nextInt();
		
		System.out.println("select the operation you want to do");
		System.out.println("1. Odd/Even\n2. Positive Or Negative\n3. Divisible by Three");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: {
			c.OddEven(a);
			break;
		}
		case 2: {
			c.PosOrNeg(a);
			break;
		}
		case 3: {
			c.DivBy3(a);
			break;
		}
		default:
			System.out.println("enter the valid operation");
		}
				
	}

}

class Choose{
	void OddEven(int a) {
		if (a%2==0) {
			System.out.println(a+" is a even Number");
		}
		else {
			System.out.println(a+" is a odd Number");
		}
	}
	void PosOrNeg(int a) {
		if (a>0) {
			System.out.println(a+" is a positive Number");
		}
		else {
			System.out.println(a+" is a negative Number");
		}
	}
	void DivBy3(int a) {
		if (a%3==0) {
			System.out.println(a+" is Divisible by 3");
		}
		else {
			System.out.println(a+" is Divisible by 3");
		}
	}
}