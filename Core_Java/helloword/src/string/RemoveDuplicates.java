package string;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String strLower = str.toLowerCase(); // Convert to lowercase for case-insensitive check
        String noDupStr = "";
        char[] charArray = strLower.toCharArray();
        char[] noDupArr = new char[0]; // Initialize empty array to track duplicates

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            // Check if current character is not in noDupArr
            if (!isPresent(noDupArr, currentChar)) {
                noDupStr += currentChar; // Add to result string
                // Expand noDupArr to include the new character
                noDupArr = Arrays.copyOf(noDupArr, noDupArr.length + 1);
                noDupArr[noDupArr.length - 1] = currentChar;
            }
        }
        System.out.println("The string without duplicates is: " + noDupStr);
    }

    // Checks if a character is present in the array
    static boolean isPresent(char[] arr, char c) {
        for (char ch : arr) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }
}