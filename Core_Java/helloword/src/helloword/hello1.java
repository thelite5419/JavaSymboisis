package helloword;

public class hello1 {
	static int a,b; 
	static void display() {
		System.out.println("A;"+a);
		System.out.println("B;"+b);
	}
	public static void main(String[] args) {
		a=10; 
		b=20;
		System.out.println("A;"+a);
		System.out.println("B;"+b);
		display();
	}

}
