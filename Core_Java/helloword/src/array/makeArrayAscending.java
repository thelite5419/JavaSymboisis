package array;

import java.util.Scanner;

public class makeArrayAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int replaceIndex = 0;
		
		 for (int i = 0; i < a.length; i++) {
	            int smallIndex = i;
	              
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[j] < a[smallIndex]) {
	                	smallIndex = j;
	                }
	            }
	            int tmp = a[i];
	            a[i] = a[smallIndex];
	            a[smallIndex] = tmp;
	        }
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("	"+a[i]);
		}
	}
}
