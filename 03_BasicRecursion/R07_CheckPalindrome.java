//Enter the word: Madam
//Madam is a palindrome.

import java.util.Scanner;

public class R07_CheckPalindrome {
    public static boolean checkPalindrome(int i, String word) {
        if (i >= word.length() / 2)
            return true;
        if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
            return false;
        }
        return checkPalindrome(i + 1, word);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine().toLowerCase();
        if (checkPalindrome(0, word)) {
            System.out.println(word + " is a palindrome.");
        } else System.out.println(word + " is not a palindrome.");
        sc.close();
    }
}
