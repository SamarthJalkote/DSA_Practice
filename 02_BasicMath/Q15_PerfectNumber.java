//Enter a number: 6
//6 is a Perfect Number

// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.Scanner;

public class Q15_PerfectNumber {
    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        int original = n;
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPerfectNumber(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
        sc.close();
    }
}
