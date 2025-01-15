package helloword;

public class nonStatic {
	 int a,b; 
	 void display() {
		System.out.println("A;"+a);
		System.out.println("B;"+b);
	}
	public static void main(String[] args) {
		nonStatic NS1 = new nonStatic();
		NS1.a=10; 
		NS1.b=20;
		System.out.println("A;"+NS1.a);
		System.out.println("B;"+NS1.b);
		NS1.display();
	}

}
