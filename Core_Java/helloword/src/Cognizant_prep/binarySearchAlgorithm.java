package Cognizant_prep;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchAlgorithm {
	 static int BianrySearch(int arr[], int low, int high, int value) {
		 int mid = 0;
		 if (high >= low) {
			mid = high+low/2;
		 }
		 
		if (arr[mid] == value) {
			return mid;
		}
		
		if (value > arr[mid]) {
			return BianrySearch(arr, mid+1, high, value);
		}
		else {
			return BianrySearch(arr, low, mid-1, value);
		}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		
		System.out.println("enter a sorted array ");
		int []arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value to find");
		int value = sc.nextInt();
		
		int result = BianrySearch(arr, 0, size -1, value);
		System.out.println("The value found at the location: " +(result+1));
	}

}
