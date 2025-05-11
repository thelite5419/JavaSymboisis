package Cognizant_prep;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String s = sc.next();
		
		System.out.println("Enter the another String: ");
		String s1 = sc.next();
		
		char[] string = s.toCharArray();
		char[] string1 = s1.toCharArray();
		Arrays.sort(string);
		Arrays.sort(string1);
		
		if (Arrays.equals(string, string1)) {
			System.out.println("The strings are anagram");
		}
		else {
			System.out.println("The string are not anagram");
		}
		
		sc.close();
	}

}
