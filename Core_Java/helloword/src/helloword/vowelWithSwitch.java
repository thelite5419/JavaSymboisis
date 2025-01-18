package helloword;

import java.util.Scanner;

public class vowelWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char Case = sc.next().charAt(0);
		
		switch (Case) {
		case 'a': {
			System.out.println(Case+ " is vowel");
			break;
		}
		case 'e': {
			System.out.println(Case+ " is vowel");
			break;
		}
		case 'i': {
			System.out.println(Case+ " is vowel");
			break;
		}
		case 'o': {
			System.out.println(Case+ " is vowel");
			break;
		}
		case 'u': {
			System.out.println(Case+ " is vowel");
			break;
		}
		
		case 'A': {
			System.out.println(Case+ " is vowel");
			break;
		}
		case 'E': {
			System.out.println(Case+ " is vowel");
			break;
		}
		case 'I': {
			System.out.println(Case+ " is vowel");
			break;
		}
		case 'O': {
			System.out.println(Case+ " is vowel");
			break;
		}
		case 'U': {
			System.out.println(Case+ " is vowel");
			break;
		}
		default:
			System.out.println(Case+ " Character is consonent");
		}
		
	}

}
