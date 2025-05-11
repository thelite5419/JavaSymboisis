package Cognizant_prep;

import java.util.Scanner;

public class evenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[]arr = new int[size];
		System.out.println("enter the values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int odd = 0, even = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("The count of ");
		System.out.println("Odd: "+odd);
		System.out.println("Even: "+even);
	}

}
