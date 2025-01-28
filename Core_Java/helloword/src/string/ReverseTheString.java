package string;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Prathamesh");
		String s2 = ""; 
		for (int i = s1.length()-1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		
		System.out.println("Before Reversing the string:"+s1);
		System.out.println("After Reversing the string:"+s2);
	}

}
