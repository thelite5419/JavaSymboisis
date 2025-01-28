package Conditional;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number You want to Convert: ");
		int a = sc.nextInt();
		
		String s = "";
		
		if (a/100000>0) {
			s = s + toWord(a/100000)+ " Lakh ";
			a = a%100000;
		}
		if (a/1000>0) {
			s = s + toWord(a/1000)+ " Thousand ";
			a = a%1000;
		}
		if (a/100>0) {
			s = s + toWord(a/100)+ " Hundrad ";
			a = a%100;
		}
		s = s+toWord(a);
		System.out.println(s);
	}

	static String toWord(int n) {
		String digit[]= {"","one","two","three","four","five","six","seven","eight","nine"};
		String digit1[]= {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String digit2[]= {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if(n<=9) {
			return digit[n];
		}
		else if(n>=11 && n<=19) {
			return digit1[n%10];
		}
		else {
			return digit2[n/10]+" "+digit[n%10];
		}
		
	}
}
