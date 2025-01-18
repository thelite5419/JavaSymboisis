package helloword;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of 5 Subject");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		
		double total = sub1+sub2+sub3+sub4+sub5;
		System.out.println("the Total is: "+total);
		
		double percentage = (total/500)*100;
		System.out.println("the percetage is: "+percentage);
		//lets assume passing percentage is 36 so 
		if (36>percentage) {
			System.out.println("the student has failed");
		}
		else {
			System.out.println("the student is passed");
		}
	}

}
