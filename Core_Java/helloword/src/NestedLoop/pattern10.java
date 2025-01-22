package NestedLoop;


public class pattern10 {
	public static void main(String[]args) {
		for (int i = 3; i > 0; i--) {
			System.out.print("space");
			for (int j = 0; j < 4; j++) {
				System.out.print("	");
				System.out.print("	"+j);
			}
			System.out.println();
		}
	}
}