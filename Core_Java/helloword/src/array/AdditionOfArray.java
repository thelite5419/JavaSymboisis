package array;

public class AdditionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,8};
		int addition = 0;
		for (int i = 0; i < a.length; i++) {
			addition += a[i];
		}
		System.out.println("the addition of Array is "+addition);
	}

}
