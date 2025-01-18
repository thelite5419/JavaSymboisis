package helloword;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units");
		int bill;
		int units = sc.nextInt();
		if (100>units) {
			System.out.println("the bill is: "+units*3);
		}
		if (101<units && 300>=units) {
			bill = 300+(units-100)*5;
			System.out.println("the bill is: "+bill);
		}
		if (301<units && 500>=units) {
			bill = 1300+(units-300)*7;
			System.out.println("the bill is: "+bill);
		}
		if (501<units) {
			bill = 2700+(units-500)*10;
			System.out.println("the bill is: "+bill);
		}
	}
}
