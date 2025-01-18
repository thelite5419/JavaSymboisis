package helloword;

import java.util.Scanner;

public class VovelsAndConsonents {
	 public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charatcter");
		String s = sc.next();
		char ch = s.charAt(0);
		System.out.println(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' && ch == 'U') {
			System.out.println("it is a vowel");
		}
		else {
			System.out.println("it is a Consonent");	
		}
		
	 }
}
