package Cognizant_prep;

import java.util.Scanner;

public class reverseStringUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.next();
		char[] ch = name.toCharArray();
		String revName = "";
		for (int i = ch.length-1 ; i >= 0; i--){
			revName += ch[i];
		}
		System.out.println("reverse Name is: "+revName);
	}

}
