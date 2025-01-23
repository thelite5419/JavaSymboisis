package array;

import java.util.Scanner;

public class findElemInArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the number you want to Find :");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int flag =0; 
		// TODO Auto-generated method stub
		int a[] = new int[]{12,2,13,4,8,10, 15, 25};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==number) {
				flag = 1;
				break;
			}
			
		}
		if (flag == 0) {
			System.out.println("element is not present in array ");
		}
		else {
			System.out.println("the Elemetn is present in the array");
		}
	}
}
