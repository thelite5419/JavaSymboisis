package helloword;

public class swappingWOvariable {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("The value of A Before swap is:"+a);
		System.out.println("The value of b Before swap is:"+b);
		a = a+b;
		b = a-b; 
		a = a-b;
		System.out.println("The value of A After swap is:"+a);
		System.out.println("The value of b After swap is:"+b);
	}

}
