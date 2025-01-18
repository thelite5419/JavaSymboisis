package helloword;

import java.util.Scanner;

public class AreaWIthSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AreaClass Area = new AreaClass();
	
		System.out.println("select the operation you want to do");
		System.out.println("1. Circle\n2. Triangle\n3. Rectangle");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: {
			Area.Circle();
			break;
		}
		case 2: {
			Area.Triangle();
			break;
		}
		case 3: {
			Area.Rectangle();
			break;
		}
		default:
			System.out.println("enter the valid operation");
		}
				
	}

}

class AreaClass{
	double area;
	Scanner sc = new Scanner(System.in);
	
	void Circle() {
		System.out.println("Enter the radius");
		int radius = sc.nextInt();
		area = 3.143*(radius*radius);
		System.out.println("area of circle "+area);
	}
	
	void Triangle() {
		System.out.println("Enter 3 sides");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = (a+b+c)/2;
		double temp = s*(s-a)*(s-b)*(s-c);
		area = Math.sqrt(temp);
		System.out.println("Area of triangle is "+area);
	}
	
	void Rectangle() {
		System.out.println("Enter the lenght and width");
		int l = sc.nextInt();
		int w = sc.nextInt();
		area = l*w;
		System.out.println("area of rectangle is "+area);
	}
}