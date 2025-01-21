package CovertToWord;

import java.util.Scanner;

public class CovertToWord {
public static void main (String[]args) {
	
		Scanner sc = new Scanner(System.in);
		String s1 = null;
		ConvertToWord ctw = new ConvertToWord();
		System.out.println("Enter the number that you want to convert to word: ");
		int number = sc.nextInt();
		int count = 0;
		int temp = number;
		int flag = 0;
		int prev = 0;
		
		while(number>0) {
			int rem = number%10;
			if(count==0) {
				prev = temp%10;
				temp /= 10; 
				if (temp%10 == 1) {
					s1 = "";
					flag = 1;
				}
				else {
					s1 = ctw.convertToWord(rem);
				}
			}
			
			
			if(count==1){
				if (flag == 1) {
					s1 = ctw.convertTo11to19(prev);
				}
				else {
					s1 = ctw.convertToTy(rem)+s1;
				}
				
			}
			
			if(count==2) {
				 s1 = ctw.convertToWord(rem) + " hundred " + s1;
			}
			
			if(count==3) {
				 s1 = ctw.convertToWord(rem) + " thousand" + s1;
			}
			
			number = number/10;
			count++;
			
		}
		
		System.out.println(s1);
	}
}

class ConvertToWord{
	String convertToWord(int rem) {
		switch (rem) {
			case 1: {
				return " one";
			}
			case 2: {
				return " two";
			}
			case 3: {
				return " three";
			}
			case 4: {
				return " four";
			}
			case 5: {
				return " five";
			}
			case 6: {
				return " six";
			}
			case 7: {
				return " seven";
			}
			case 8: {
				return " eight";
			}
			case 9: {
				return " nine";
			}
			default:
				return ""; 
		}
	}
	
	String convertToTy(int rem) {
		switch (rem) {
		case 1: {
			return "ten";
		}
		case 2: {
			return "twenty";
		}
		case 3: {
			return "thirty";
		}
		case 4: {
			return "fourty";
		}
		case 5: {
			return "fifty";
		}
		case 6: {
			return "sixty";
		}
		case 7: {
			return "seventy";
		}
		case 8: {
			return "eighty";
		}
		case 9: {
			return "ninety";
		}
		default:
			return ""; 
	}
}
	
	String convertTo11to19(int rem) {
		switch (rem) {
		case 1: {
			return "eleven";
		}
		case 2: {
			return "twelve";
		}
		case 3: {
			return "thirteen";
		}
		case 4: {
			return "fourteen";
		}
		case 5: {
			return "fifteen";
		}
		case 6: {
			return "sixteen";
		}
		case 7: {
			return "seventeen";
		}
		case 8: {
			return "eighteen";
		}
		case 9: {
			return "nineteen";
		}
		default:
			return ""; 
	}
}
	

	
	
}