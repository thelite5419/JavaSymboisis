package recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        FactClass f = new FactClass();
        f.getNumber();
        int result = f.fact(f.a);
        f.putNumber(result);
    }
}

class FactClass {
    int a;

    void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial");
        a = sc.nextInt();
        sc.close(); 
    }

    void putNumber(int fact) {
        System.out.println("The factorial of the given number: " + a);
        System.out.println("is: " + fact);
    }

    int fact(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }
}