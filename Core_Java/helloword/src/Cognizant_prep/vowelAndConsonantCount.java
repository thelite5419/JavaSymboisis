package Cognizant_prep;

import java.util.Scanner;

public class vowelAndConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		int vowel = 0; 
		for (int i = 0; i < s.length(); i++) {
			char ch = s.toUpperCase().charAt(i);
			System.out.println("current char"+ch);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
				System.out.println("if here");
				vowel++;
			}
		}
		System.out.println("Vowel count is: "+vowel);
	}
}
