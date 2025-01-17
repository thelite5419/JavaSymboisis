// wap to Access the string through the buffer reader 
package helloword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRead {
 public static void main(String[] args) {
	 InputStreamReader isr = new InputStreamReader(System.in);
	 BufferedReader br = new BufferedReader(isr);
	 System.out.println("Enter the Name:");
	 String s; 
	 try {
		s =  br.readLine();
		System.out.println("string is: "+s);
		System.out.println("Enter the Character:");
		char ch =(char) br.read();
		System.out.println("Character is: "+ch);
	} catch (IOException e) {
		e.printStackTrace();
	}
 }
}
