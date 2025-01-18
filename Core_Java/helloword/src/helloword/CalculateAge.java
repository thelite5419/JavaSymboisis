package helloword;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
	public static void main (String[]args) {
		System.out.println("enter the birth date");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		
		LocalDate bdate = LocalDate.parse(s);//yyyy-MM-DD
		LocalDate ldate = LocalDate.now();

		Period p = Period.between(bdate, ldate);
		int y = p.getYears();
		int m = p.getMonths();
		int d = p.getDays();
		
		System.out.println("you are "+y+" years " +m+" months "+d+" days old");

	}
}
