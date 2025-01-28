package multiDiementionalArray;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TransposeTheArray {

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
		
		int [][]b = new int[3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		
		System.out.println("\nbefore transpose of array:"+Arrays.deepToString(a));
		System.out.println("\nbefore transpose of array:"+Arrays.deepToString(b));
	}

}
