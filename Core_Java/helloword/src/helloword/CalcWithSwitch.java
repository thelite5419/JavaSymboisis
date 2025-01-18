package helloword;

import java.util.Scanner;

public class CalcWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Caclulator c = new Caclulator();
		
		System.out.println("enter the two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter the operation you want to do ");
		System.out.println("+, *, /, - ");
		
		char Ch = sc.next().charAt(0);
		
		switch (Ch) {
		case '+': {
			c.Add(a, b);
			break;
		}
		case '*': {
			c.Mul(a, b);
			break;
		}
		case '-': {
			c.Sub(a, b);
			break;
		}
		case '/': {
			c.Div(a, b);
			break;
		}
		default:
			System.out.println("enter the valid operation");
		}
				
	}

}

class Caclulator{
	void Add(int a, int b) {
		System.out.println("The addition Is: "+(a+b));
	}
	void Sub(int a, int b) {
		System.out.println("The addition Is: "+(a-b));
	}
	void Mul(int a, int b) {
		System.out.println("The addition Is: "+(a*b));
	}
	void Div(double a, double b) {
		System.out.println("The addition Is: "+(a/b));
	}
}