package helloword;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        if (n >= 1) System.out.print("0");
        if (n >= 2) System.out.print(", 1");
        
        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        
        scanner.close();
    }
}
