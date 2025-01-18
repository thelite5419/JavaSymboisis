package helloword;

import java.util.Scanner;

public class SwitchWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char Case = sc.next().charAt(0);
		
		switch (Case) {
		case 'a': {
			System.out.println("a for Apple");
			break;
		}
		case 'b': {
			System.out.println("b for bat");
			break;
		}
		case 'c': {
			System.out.println("c for cat");
			break;
		}
		case 'd': {
			System.out.println("d for dog");
			break;
		}
		default:
			System.out.println("enter a, b, c or d");
		}
		
	}

}
