package Cognizant_prep;

public class swapvariable {
	public static void main(String [] args ) {
		int a = 10; 
		int b = 20; 
		System.out.println("after swap");
		a = a+b; 
		b = a-b;
		a = a-b; 
		System.out.println("A :"+ a+ " and B :"+ b);
	}
}
