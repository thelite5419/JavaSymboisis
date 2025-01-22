package NestedLoop;

public class tablesOfTwo {
	public static void main(String[]args) {
		for (int rows  = 1; rows <= 10; rows++) {
			for (int column = 1; column <= 10; column++) {
				int number = rows*column;
				System.out.print("	"+number);
			}
			System.out.println();
		}
	}
}
