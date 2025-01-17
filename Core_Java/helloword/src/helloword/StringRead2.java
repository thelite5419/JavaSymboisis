// wap to Access the string through the buffer reader 
package helloword;
import java.io.IOException;
import java.util.Scanner;

public class StringRead2 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the new string");
	String s = sc.next();
	char ch = s.charAt(0);
	
	System.out.println("the input string is:"+s);
	System.out.println("the char is:"+ch);
 }
}
