package array;

public class LargestValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{1,2,13,4,8};
		int largest = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=largest) {
				largest = a[i];
			}
		}
		System.out.println("the addition of Array is "+largest);
	}

}
