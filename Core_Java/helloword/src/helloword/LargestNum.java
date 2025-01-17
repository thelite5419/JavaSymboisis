package helloword;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				System.out.println("ente the two number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a<b) {
			System.out.println("the second number is bigger");
		}
		else {
			System.out.println("the first number is bigger");
		}
	}

}
