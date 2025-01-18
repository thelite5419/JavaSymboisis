package helloword;

import java.util.Scanner;

public class SalaryCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int GrossSalary;
		System.out.println("Enter the Salary of The Employee: ");
		int baseSalary = sc.nextInt();
		
		if (10000<=baseSalary) {
			int DA = (baseSalary*30)/100;
			int HRA  = (baseSalary*20)/100;
			GrossSalary = baseSalary+DA+HRA;
		}
		else {
			int DA = (baseSalary*20)/100;
			int HRA  = (baseSalary*15)/100;
			GrossSalary = baseSalary+DA+HRA;
		}
		
		int PF = (baseSalary*12)/100;
		int Insurance = 500;
		int NetDeduct = PF+Insurance;

		int NetSalary = GrossSalary-NetDeduct;
		
		System.out.println("the in hand Salary is: "+NetSalary);
	}

}
