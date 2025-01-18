package helloword;

import java.util.Scanner;

public class HireOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender M or F");
		char gender = sc.next().charAt(0);
		
		if(gender == 'M' || gender == 'm' ){
			System.out.println("Enter the height of the candidate :");
			int height = sc.nextInt();
			System.out.println("Enter the age of the candidate :");
			int age = sc.nextInt();
			if(170<= height && 25<= age) {
				System.out.println("the Candidate is selected");
			}
			else {
				System.out.println("candidate is not selected");
			}
		}
		
		if(gender == 'F' || gender == 'f' ){
			System.out.println("Enter the height of the candidate :");
			int height = sc.nextInt();
			System.out.println("Enter the age of the candidate :");
			int age = sc.nextInt();
			if(160<= height && 22<= age) {
				System.out.println("the Candidate is selected");
			}
			else {
				System.out.println("candidate is not selected");
			}
		}
	}

}
