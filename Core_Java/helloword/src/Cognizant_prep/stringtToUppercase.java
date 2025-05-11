package Cognizant_prep;

import java.util.Scanner;

public class stringtToUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  string: ");
		String s = sc.next();
		System.out.println("The uppercaseIs : "+s.toUpperCase());
		System.out.println("The uppercaseIs : "+s.subSequence(2, 4));
		
	}

}
