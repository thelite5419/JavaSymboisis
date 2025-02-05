package string;

import java.util.Scanner;

public class RemoveCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		
		String afterRemove = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (ch != str.charAt(i)) {
				afterRemove += str.charAt(i);
			}
		}
		System.out.println("The string After Removeing the Character: "+afterRemove);
	}

}
