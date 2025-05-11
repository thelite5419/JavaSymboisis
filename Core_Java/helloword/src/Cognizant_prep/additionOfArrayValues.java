package Cognizant_prep;

import java.util.Scanner;

public class additionOfArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int add = 0; 
		for (int i = 0; i < a.length; i++) {
			add += a[i];
		}
		System.out.println("addition is : "+add);
	}
}
