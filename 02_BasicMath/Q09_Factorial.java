//Enter the first number: 5
//Factorial of 5 is 120

// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.Scanner;

public class Q09_Factorial {
    public static int fact(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Factorial of " + a + " is " + fact(a));
        sc.close();
    }
}
