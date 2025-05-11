package Cognizant_prep;

import java.util.Scanner;

public class sumOfArrayInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int addition = 0;
		System.out.println("Enter the Size of The Array: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter the Size of Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the Addition is :");
		for (int i = 0; i < arr.length; i++) {
			addition += arr[i];
		}
		
		System.out.println(addition);
	}

}
