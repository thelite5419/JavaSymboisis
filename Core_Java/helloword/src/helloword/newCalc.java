package helloword;
import java.util.Scanner;

public class newCalc {
	
	public static void main(String[] args) {
		newCalculator t1  = new newCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A");
		t1.a = sc.nextInt(); 
		System.out.println("Enter the value of B");
		t1.b = sc.nextInt(); 
		
		t1.addition();
		t1.substraction();
		t1.multiplication();
	}

}

class newCalculator {
	int a,b;
	void addition() {
		int c = a+b;
		System.out.println("The Addition is:"+c);
	}
	void substraction() {
		int c = a-b;
		System.out.println("The substraction is:"+c);
	}
	void multiplication() {
		int c = a*b;
		System.out.println("The multiplication is:"+c);
	}
	
}