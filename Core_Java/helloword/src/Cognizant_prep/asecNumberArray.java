package Cognizant_prep;

import java.util.Scanner;

public class asecNumberArray {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void prathameshSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			//System.out.println("outer for loop minIndex is: "+minIndex);
			for (int j = i+1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					//System.out.println("if is true :"+arr[minIndex]+","+arr[j]);
					minIndex = j;
				}
			}
			int temp = arr[minIndex]; 
			arr[minIndex] = arr[i]; 
			arr[i] = temp;
		}
	}
	
	
	 static void bubbleSort(int arr[], int n){
	        for (int i = 0; i < n-1 ; i++) {
				for (int j = 0; j < n -i -1; j++) {
					if (arr[j] > arr [j+1]) {
						int temp = arr[j]; 
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is");
		printArray(arr);
		
		System.out.println("Sorting the Array : ");
		//prathameshSort(arr);
		bubbleSort(arr, size);
		
		System.out.println("after the sorting");
		System.out.println("The Array is");
		printArray(arr);
	}

}