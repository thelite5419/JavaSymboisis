package string;

import java.util.Scanner;

public class AscendingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        
        char[] charArray = str1.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[j] < charArray[minIndex]) {
                    minIndex = j;
                }
            }

            char temp = charArray[minIndex];
            charArray[minIndex] = charArray[i];
            charArray[i] = temp;
        }
        
        String asecStr = new String(charArray);
        
        System.out.println("The String in ascending order is: " + asecStr);
    }
}