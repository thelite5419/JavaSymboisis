package helloword;

public class leapYear {
	public static void main(String[] args) {
		leapYear4 lp = new leapYear4();
		lp.leapyear(2000);
		lp.leapyear(2016);
		lp.leapyear(2017);
		
	}
}

class leapYear4{
	void leapyear(double year) {
		if((year%4==0)&&(year%100!=0)&&(year%400==0)) {
			System.out.println("the year is not leaf: "+year);
		}
	}
}
