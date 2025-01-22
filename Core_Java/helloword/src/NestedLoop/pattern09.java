package NestedLoop;


public class pattern09 {
	public static void main(String[]args) {
		int count = 1;
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(count+"	");
				count++;
			}
			System.out.println();
		}
	}
}