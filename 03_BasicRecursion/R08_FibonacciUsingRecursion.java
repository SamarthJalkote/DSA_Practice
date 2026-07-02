// Enter the term: 6
// 6th Fibonacci number is: 8

// Time Complexity: O(2^N)
// Space Complexity: O(N)

import java.util.Scanner;

public class R08_FibonacciUsingRecursion {
    public static int fib(int a) {
        if (a <= 1) return a;
//        int start = fib(a-2); // first this gets executed completely
//        int last = fib(a-1);  // after first this is executed
//        return last + start;
        return fib(a - 1) + fib(a - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n = sc.nextInt();
        System.out.println(n + "th Fibonacci number is: " + fib(n));
    }
}
