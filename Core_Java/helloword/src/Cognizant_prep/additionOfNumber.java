package Cognizant_prep;
import java.util.*;

public class additionOfNumber {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num; 
		System.out.println("number is: "+temp);
		int add = 0; 
		while(temp > 0) {
		int tempVal = temp%10; 
		add += tempVal; 
		temp = temp/10;
		}
		System.out.println("the addition is: "+add);
	}
}
