//Enter the number to reverse: 124500
//Reversed number is: 5421

//Time Complexity = O(log₁₀N)
//Space Complexity = O(1)

import java.util.Scanner;

public class Q02_ReverseNumber {
    public static int reverse(int num) {
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int num = sc.nextInt();
        System.out.println("Reversed number is: " + reverse(num));
        sc.close();
    }
}
