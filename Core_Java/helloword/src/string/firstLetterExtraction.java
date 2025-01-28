package string;

import java.util.Scanner;

public class firstLetterExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = sc.nextLine();
		
		 String[] words = string.split(" ");
	        for (int i = 0; i < words.length; i++) {
	                words[i] = words[i].substring(0, 1).toUpperCase();
	        }
	        String result = String.join(" ", words);
	        System.out.println("first letters of String: " + result);
		sc.close();
	}

}
