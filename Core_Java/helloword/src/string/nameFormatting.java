package string;

import java.util.Scanner;

public class nameFormatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = sc.nextLine();
		int space = 1;
		char ch;
		
		String[] words = name.split(" ");
		
		String name1 = "";
		name1 = words[2] +' '+ words[0]+' '+words[1];
		
		System.out.println("the formated name is:"+name1);
		
		for (int i = 0; i < name.length()-1; i++) {
			ch = name.charAt(i);
			if (ch== ' ' && name.charAt(i+1) != ' ') {
				System.out.println(space); // debug
				if (space ==2) {
					System.out.println("space 2"); //debug
					name = name.substring(i)+ " " + name.substring(0, i);
				}
				space++;
			}
		}
		
		System.out.println("the formatted name is: "+name);
	}
}
