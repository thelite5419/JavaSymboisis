package helloword;

import java.util.Scanner;

public class forLoop9 {

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
		System.out.println("The original number is: "+number+" reverse number is: "+reverse);
	}
}
