package NestedLoop;


public class pattern08 {
	public static void main(String[]args) {
		int count = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5 ; j++) {
				System.out.print(count+"	");
				count++;
			}
			System.out.println();
		}
	}
}