//Enter the word: Madam
//Madam is a palindrome

// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.Scanner;

public class Q17_CheckPalindromeString {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int len = word.length();
        int start = 0;
        int end = len - 1;
        while (start < end) {
            if (word.charAt(start) == word.charAt(end)) {
                start++;
                end--;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
        sc.close();
    }
}
