package Cognizant_prep;

import java.util.Scanner;

public class occuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		System.out.println("Enter the Character");
		String s1 = sc.next();
		char ch = s1.charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("The occurance of :" +ch+" is :"+count);
		
	}

}
