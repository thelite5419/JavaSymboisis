package string;

import java.util.Scanner;

public class possibleRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			str = str.substring(1)+str.substring(0, 1);
			System.out.println(str);
		}
	}
}
