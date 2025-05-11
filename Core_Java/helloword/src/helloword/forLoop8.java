package helloword;

import java.util.Scanner;

public class forLoop8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int sum = 0;
		int temp = number; 
		while (temp > 0) {
			int tempVar = (temp%10);
			sum +=tempVar;
			temp = temp/10;
		}
		System.out.println(sum);
	}
}
