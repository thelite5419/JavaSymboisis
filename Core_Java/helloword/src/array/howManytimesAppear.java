package array;

import java.util.Scanner;

public class howManytimesAppear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number you want to find the count :");
		int number = sc.nextInt();

		int count = 0; 
		// TODO Auto-generated method stub
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==number) {
				count++;
			}
		}
		
		System.out.println("the Number "+number+ " is present in array "+count+" times");
	
		
	}
}
