package helloword;

public class addition {
	
	public static void main(String[] args) {
		Calculator t1  = new Calculator();
		t1.a=10; 
		t1.b=20;
		System.out.println("A;"+t1.a);
		System.out.println("B;"+t1.b);
		t1.addition();
		t1.substraction();
		t1.multiplication();
		
	}

}

class Calculator {
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