package NestedLoop;


public class pattern06 {
	public static void main(String[]args) {
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("	"+i);
			}
			System.out.println();
		}
	}
}