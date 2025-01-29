package string;

import java.util.Scanner;

public class CountsOfEverything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int smallCharCount = 0;
		int capitalCharCount = 0;
		int DigitCount = 0;
		int vowelCount = 0;
		int wordCount = 1;
		char ch;
		
		for (int i = 0; i < str.length()-1; i++) {
			ch = str.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				smallCharCount++;
			}
			if (ch >= 'A' && ch <= 'Z') {
				capitalCharCount++;
			}
			if (ch >= 48 && ch <= 57) {
				DigitCount++;
			}
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowelCount++;
			}
			if(ch == ' ' && str.charAt(i+1) != ' ') {
				wordCount++;
			}
			
		}
		
		
		System.out.println("character count is "+str.length());
		System.out.println("digit count is "+DigitCount);
		System.out.println("Small character count is "+smallCharCount);
		System.out.println("Captital count is "+capitalCharCount);
		System.out.println("vowel count is "+vowelCount);
		System.out.println("word count is "+wordCount);
	}

}
