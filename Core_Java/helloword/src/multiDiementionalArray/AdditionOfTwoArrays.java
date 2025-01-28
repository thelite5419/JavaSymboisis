package multiDiementionalArray;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [][]a = new int[3][3];
		System.out.println("Enter the 1st array: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("first array is: "+Arrays.deepToString(a));
		System.out.println("Enter the 2nd array: ");
		int [][]b = new int[3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j]= sc.nextInt();
			}
		}
		System.out.println("second array is: "+Arrays.deepToString(b));
		System.out.println("the Addition of array is: ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] += a[i][j];
			}
		}
		System.out.println(Arrays.deepToString(b));
	}

}
