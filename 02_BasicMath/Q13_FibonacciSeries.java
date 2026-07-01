//Enter the number of terms: 7
//Fibonacci Series: 0 1 1 2 3 5 8

// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.*;

public class Q13_FibonacciSeries {
    public static void fibonaci(int n) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        fibonaci(n);
        sc.close();
    }
}
