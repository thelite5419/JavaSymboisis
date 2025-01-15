package helloword;

class class0{
	static int a,b; 
	static void display() {
		System.out.println("A;"+a);
		System.out.println("B;"+b);
	}
}

public class class1 {
	public static void main(String[] args) {
		class0 c1 = new class0();
		c1.a=10; 
		c1.b=20;
		System.out.println("A;"+c1.a);
		System.out.println("B;"+c1.b);
		c1.display();
	}

}