package multiDiementionalArray;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AcceptMulArrayAndDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [][]a = new int[2][3];
		System.out.println("Enter the array: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("the Array that is entered is: "+Arrays.deepToString(a));
	}

}
