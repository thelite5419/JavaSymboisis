package NestedLoop;


public class pattern07 {
	public static void main(String[]args) {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5 ; j++) {
				System.out.print("	"+(j));
			}
			System.out.println();
		}
	}
}