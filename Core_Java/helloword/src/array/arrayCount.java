package array;

import java.util.Scanner;

public class arrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string");
		int count=0;
		String nam=sc.next();
		char[] id=nam.toCharArray();
		for(int i=0;i<id.length;i++)
		{
			if (id[i] >= 'a' && id[i] <= 'z')
			{
				System.out.println("if true "+id[i]);
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}