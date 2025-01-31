package string;

import java.util.Scanner;

public class MaxMinOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int count = 0;
		char maxChar = 0;
		int max = 0;
		char minChar = 0;
		int min = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;	
				}
			}
			if (max<count) {
				maxChar=ch;
				max = count;
			}
		}
		System.out.println("max char is: "+maxChar);
		System.out.println("its occurance is: "+max);
		System.out.println("min char is"+minChar);
		System.out.println("its occurance is"+min);
	}

}
