package NestedLoop;


public class PrimeNumberOneTo100 {
	public static void main(String[]args) {
		for (int number = 1; number < 100; number++) {
			boolean flag = false;
			for (int i = 2; i  <= number/2; i++) {
				if (number%i == 0) {
					flag = true;
				}
			}
			if (flag != true) {
				System.out.print(number+"	");
			}
		}
		
	}
}