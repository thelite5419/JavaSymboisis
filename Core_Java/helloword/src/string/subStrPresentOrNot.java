package string;

import java.util.Scanner;

public class subStrPresentOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the Substring");
		String subStr = sc.nextLine();
		
		boolean flag = false;
		
		for (int i = 0; i < str.length()-1; i++) {
			//System.out.println("Checking: " + str.substring(i, i + subStr.length()));
			if (subStr.equals(str.substring(i, i + subStr.length()))) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("the string is present");
		}
		else {
			System.out.println("the string is not present");
		}
	}
}
