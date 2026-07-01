// Enter a number: 5
// Sum of the first 5 natural numbers is: 15

// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.Scanner;

public class Q14_SumOfNaturalNumbers {
    public static int sumOfDigits(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of the first " + n + " natural numbers is: " + sumOfDigits(n));
        sc.close();
    }
}
