package recursion;

import java.util.Scanner;

public class reversingTheNumber {

    public static void main(String[] args) {
    	revese r = new revese();
        r.getNumber();
        int result = r.reverse(r.a);
        r.putNumber(result);
    }
}

class revese {
    int a;

    void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbe for reversing");
        a = sc.nextInt();
        sc.close(); 
    }

    void putNumber(int rev) {
        System.out.println("The number before reversing is: " + a);
        System.out.println("The number After reversing is: " + rev);
    }

    int reverse(int num) {
        return reverseHelper(num, 0);
    }

    int reverseHelper(int num, int rev) {
        if (num == 0)
            return rev;
        return reverseHelper(num / 10, rev * 10 + num % 10);
    }
}