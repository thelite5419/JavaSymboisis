package helloword;

public class triangleArea {
	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c=5;
		System.out.println("side1 "+a);
		System.out.println("side2 "+b);
		System.out.println("side3 "+c);
		int s = (a+b+c)/2;
		System.out.println("s is "+s);
		double temp = s*(s-a)*(s-b)*(s-c);
		System.out.println("temp is"+temp);
		double Area = Math.sqrt(temp);
		System.out.println("Area of triangle is "+Area);
	}

}
