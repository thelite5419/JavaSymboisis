package array;

import java.util.Scanner;

public class inPlaceReplacement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		
		System.out.println("Enter the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int lenght = a.length-1;
		for (int i = 0; i < a.length/2; i++) {
			int temp = a[lenght]; 
			a[lenght]= a[i];
			a[i] = temp;
			lenght--;
		}
		System.out.println("after replacement");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
	}
}
