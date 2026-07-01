//Enter the base number: 2
//Enter the exponent number: 5
//2^5 = 32

// Time Complexity: O(exponent)
// Space Complexity: O(1)

import java.util.Scanner;

public class Q10_PowerOfNumber {
    public static int power(int a, int b) {
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent number: ");
        int exponent = sc.nextInt();
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
        sc.close();
    }
}
