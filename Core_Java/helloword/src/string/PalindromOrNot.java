package string;


public class PalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("madam");
		String s2 = new String("maga");
		boolean flag = false;
		
		int count = 0;
		if (s1.length()==s2.length()) {
			for (int i = s1.length()-1; i >= 0; i--) {
				
				if (s2.charAt(count) != s1.charAt(i)) {
					flag = true;
					System.out.println("the string s1: "+s1+" s2: "+s2+" is not palindrom");
					break;
				}
				count++;
			}
			
		}
		else {
			System.out.println("the length of string is not same so it is not palindrom");
			System.exit(0);
		}
	
	}

}
