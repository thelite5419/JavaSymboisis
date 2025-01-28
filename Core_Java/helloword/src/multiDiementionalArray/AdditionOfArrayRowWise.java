package multiDiementionalArray;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfArrayRowWise {

	public static void main(String[] args) {
		//int row1 = 0, row2 = 0, row3 = 0, count = 0;
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [][]a = new int[3][3];
		System.out.println("Enter the array: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		int add[] = new int[3]; 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//				 if (count == 0) {
//					row1 += a[j][i];
//				}
//				 if (count == 1) {
//						row2 += a[j][i];
//				}
//				 if (count == 2) {
//						row3 += a[j][i];
//				}
				add[i] += a[j][i];
				
			}
			//count++;
			//System.out.println("count of I is: "+i+" count of count: "+count);// debug statement
		}
		
		System.out.println("the Array that is entered is: "+Arrays.deepToString(a));
//		System.out.println("addition of First Row: "+row1);
//		System.out.println("addition of First Row: "+row2);
//		System.out.println("addition of First Row: "+row3);
		for (int i = 0; i < add.length; i++) {
			System.out.println("addition row wise is :"+add[i]);
		}
	}

}
