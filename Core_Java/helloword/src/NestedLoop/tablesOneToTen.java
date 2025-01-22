package NestedLoop;

public class tablesOneToTen {
	public static void main(String[]args) {
		int count = 1; 
		for (int i = 1; i <= 10; i++) {
		
			for (int rows  = 1; rows <= 10; rows++) {
				System.out.print("	"+count);
				for (int column = 1; column <= 10; column++) {
					count++;
				}
			}
			System.out.println("\t");
			count = 1;
			count +=i;
		}
	}
}