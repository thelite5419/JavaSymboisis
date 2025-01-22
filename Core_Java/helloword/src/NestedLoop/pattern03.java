package NestedLoop;


public class pattern03 {
	public static void main(String[]args) {
		for (int i = 1; i < 6; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("	"+j);
			}
			System.out.println();
		}
	}
}