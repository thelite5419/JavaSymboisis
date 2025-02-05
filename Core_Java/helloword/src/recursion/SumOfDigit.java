package recursion;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
    	sum sod = new sum();
    	sod.getNumber();
        int result = sod.sodMethod(sod.a);
        sod.putNumber(result);
    }
}

class sum {
    int a;

    void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a = sc.nextInt();
        sc.close(); 
    }

    void putNumber(int sum) {
        System.out.println("the sum of degit: " + a);
        System.out.println("is: " + sum);
    }

    int sodMethod(int a) {
        if (a==0) {
        	return 0;
        }
        else {
        	return (a%10)+sodMethod(a/10);
        }
    }
}