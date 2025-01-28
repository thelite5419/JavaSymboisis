package multiDiementionalArray;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfArrayColumnWise {

	public static void main(String[] args) {
		//int column1 = 0, column2 = 0, column3 = 0, count = 0;
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
//					 column1 += a[i][j];
//				}
//				 if (count == 1) {
//					 column2 += a[i][j];
//				}
//				 if (count == 2) {
//					 column3 += a[i][j];
//				}
				add[i] += a[i][j];
			}
//			count++;
//			System.out.println("count of I is: "+i+" count of count: "+count);// debug statement
		}
		
		System.out.println("the Array that is entered is: "+Arrays.deepToString(a));
//		System.out.println("addition of First Row: "+column1);
//		System.out.println("addition of First Row: "+column2);
//		System.out.println("addition of First Row: "+column3);
		
		for (int i = 0; i < add.length; i++) {
			System.out.println("addition row wise is :"+add[i]);
		}
	}

}
