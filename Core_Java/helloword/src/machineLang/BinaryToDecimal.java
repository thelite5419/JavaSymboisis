package machineLang;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,p=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		a = sc.nextInt();
		
		
		while(a>0) {
			b=a%8;
			sum = sum+b*p;
			a = a/8;
			p=p*10;
		}
		
		System.out.println("The Binary Conversion is: "+sum);
	}

}
