package Cognizant_prep;
import java.util.*;


public class reverseTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int reverse = 0; 
		int temp = number; 
		while(temp>0) {
			int tempval = temp%10; 
			reverse = (reverse*10) + tempval;
			temp = temp/10;
		}
		System.out.println(reverse);
	}
}
