package multiDiementionalArray;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [][]a = new int[3][3];
		System.out.println("Enter the array: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("The Entered Array is: "+Arrays.deepToString(a));
		
		int countOfNonZero = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != 0) {
					countOfNonZero++;
				}
			}
		}
		
		
		int[][] sparse = new int[countOfNonZero][3];
		int index = 0; 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]>0) {
					sparse[index][0] = i; 
					sparse[index][1] = j; 
					sparse[index][2] = a[i][j];
					index++;
				}
			}
			
		}
		
		System.out.println("The sparse table is: "+Arrays.deepToString(sparse));
		
	}

}
