package helloword;

public class forLoop5 {

	public static void main(String[] args) {
		int add=0;
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10 ; i++) {
			if (i%2==0) {
				System.out.println(i);
				add += i;
			}
		}
		System.out.println(add);
	}

}
