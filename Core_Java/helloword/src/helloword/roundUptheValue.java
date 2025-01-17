package helloword;

public class roundUptheValue {

	public static void main(String[] args) {
		RoundOFValue rov = new RoundOFValue();
		rov.roundof(123);
		rov.roundof(127);
		rov.roundof(451);
		rov.roundof(4564);
		rov.roundof(4528);
		rov.roundof(450);
	}

}

class RoundOFValue{
	void roundof(int roundOfAmount){
	int modulo = roundOfAmount%10;
		if(modulo>5){
			int addValue = 10-modulo;
			System.out.println("the Round of Value is:"+(roundOfAmount+addValue));
		}
		else {
			System.out.println("the Round of Value is:"+(roundOfAmount-modulo));
		}
	}
}