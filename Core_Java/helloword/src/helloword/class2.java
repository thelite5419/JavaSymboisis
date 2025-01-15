package helloword;

class class3{
	static int a,b; 
	static void display() {
		System.out.println("A;"+a);
		System.out.println("B;"+b);
	}
}

public class class2 {
	public static void main(String[] args) {
		//class2 c1 = new class2();
		class3.a=10; 
		class3.b=20;
		System.out.println("A;"+class3.a);
		System.out.println("B;"+class3.b);
		class3.display();
	}

}