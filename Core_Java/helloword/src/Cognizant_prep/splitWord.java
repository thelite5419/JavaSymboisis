package Cognizant_prep;

import java.util.Scanner;

public class splitWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.nextLine();
		
		String []s = string.split(" ");
		System.out.println("After split :");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
