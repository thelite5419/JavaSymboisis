package Cognizant_prep;

import java.util.Scanner;

public class reverseArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int[]arr1 = new int[size];
		System.out.println("Enter the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the reverse array is :");
		int j = 0;
		for (int i = size-1; i >= 0; i--) {
			arr1[j] = arr[i];
			j++;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
