//A number is called a palindrome if it reads the same from left to right and right to left.
//Enter a number: 141
//141 is a palindrome number.

//Time Complexity: O(log n)
//Space Complexity: O(1)

import java.util.Scanner;

public class Q03_PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
        sc.close();
    }
}
