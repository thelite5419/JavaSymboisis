package Cognizant_prep;

import java.util.Scanner;

public class stringRead {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the new string");
	String s = sc.next();
	char ch = s.charAt(0);
	
	System.out.println("the input string is:"+s);
	System.out.println("the char is:"+ch);
	
	for (int i = 0; i < s.length(); i++) {
		System.out.println(s.charAt(i));
	}
}
}
