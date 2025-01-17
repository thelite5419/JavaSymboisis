package helloword;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the purchase price: ");
		int a = sc.nextInt();
		System.out.println("enter the selling  price: ");
		int b = sc.nextInt();
		if (a<b) {
			System.out.println("Had profit");
		}
		else {
			System.out.println("Had loss");
		}
	}

}
