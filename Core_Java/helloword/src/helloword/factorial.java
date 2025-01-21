package helloword;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int fact=1;
		// TODO Auto-generated method stub
		for (; number >= 1 ; number--) {
			fact *= number;

		}
		System.out.println(fact);

}
}
