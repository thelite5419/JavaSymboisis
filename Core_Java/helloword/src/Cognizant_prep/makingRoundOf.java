package Cognizant_prep;

public class makingRoundOf {
	public static void main(String []args) {
		roundOf.roundOFvalue(125);
		roundOf.roundOFvalue(1254);
		roundOf.roundOFvalue(47576);
		roundOf.roundOFvalue(2456);
	}
}

class roundOf{
	static void roundOFvalue(int val){
		int modulo = val % 10;
		if (modulo < 5) {
		int val2 = val - modulo;
		System.out.println("the round of value is: "+ val2);
		}
		else{
			int addVal = 10 - modulo; 
			int val2 = addVal + val;
			System.out.println("the round of value is: "+val2);
		}
	}
}
