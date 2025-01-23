package array;

public class LowestValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{12,2,13,4,8};
		int lowest = a[1];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=lowest) {
				lowest = a[i];
			}
		}
		System.out.println("the addition of Array is "+lowest);
	}

}
