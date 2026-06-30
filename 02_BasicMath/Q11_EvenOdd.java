//Enter a number: 45
//45 is Odd
// Time Complexity: O(1)
// Space Complexity: O(1)

import java.util.Scanner;

public class Q11_EvenOdd {
    public static String evenOdd(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + " is " + evenOdd(n));
        sc.close();


    }
}
