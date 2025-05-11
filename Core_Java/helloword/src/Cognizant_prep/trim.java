package Cognizant_prep;

import java.util.Scanner;

public class trim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String trimmed = input.trim();
        
        System.out.println("after the trim :"+trimmed);

	}

}
