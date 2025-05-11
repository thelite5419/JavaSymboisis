package array;

import java.util.Scanner;

public class replaceTheNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number for replacement");
		int replacement = sc.nextInt();
		
		System.out.println("Enter the number you want to replace :");
		int replace = sc.nextInt();
	
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==replace) {
				a[i] = replacement;
			}
		}
		
		System.out.println("The array after replacement: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t"+a[i]);
		}
		
	}
}
