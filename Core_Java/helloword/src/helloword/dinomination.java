//wap to accpet amount show its dinomination 
package helloword;

public class dinomination {

	public static void main(String[] args) {
		int amount = 44014;
		System.out.println("the amount is:"+amount);
		// TODO Auto-geerated method stub
		if (amount>=500) {
			int countOf500 = amount/500;
			System.out.println("The count of 500 notes is: "+countOf500);
			amount -=countOf500*500; 
		}
		if (amount>=200) {
			int countOf200 = amount/200;
			System.out.println("The count of 200 notes is: "+countOf200);
			amount -=countOf200*200; 
		}
		if (amount>=100) {
			int countOf100 = amount/100;
			System.out.println("The count of 100 notes is: "+countOf100);
			amount -=countOf100*100; 
		}
		if (amount>=50) {
			int countOf50 = amount/50;
			System.out.println("The count of 50 notes is: "+countOf50);
			amount -=countOf50*50; 
		}
		if (amount>=20) {
			int countOf20 = amount/20;
			System.out.println("The count of 20 notes is: "+countOf20);
			amount -=countOf20*20; 
		}
		if (amount>=10) {
			int countOf10 = amount/10;
			System.out.println("The count of 10 notes is: "+countOf10);
			amount -=countOf10*10; 
		}
		if (amount>=5) {
			int countOf5 = amount/5;
			System.out.println("The count of 5 notes is: "+countOf5);
			amount -=countOf5*5; 
		}
		if (amount>=1) {
			int countOf1 = amount/1;
			System.out.println("The count of 1 notes is: "+countOf1);
			amount -=countOf1*1; 
		}
	}

}
