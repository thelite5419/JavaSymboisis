package helloword;

import java.util.Scanner;

public class forLoop10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int temp = number; 
		int reverse= 0;
		while(temp>0) {
			int rem = temp%10;
			reverse = (reverse*10)+rem; 
			temp = temp/10;
		}
		if (number == reverse) {
			System.out.println("number is palindrom");
		}
		else {
			System.out.println("number is not palindrom ");
		}
	}
}
