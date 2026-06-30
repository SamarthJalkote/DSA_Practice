//Enter the first number: 12
//Enter the second number: 18
//The GCD of 12 and 18 is 6

//Brute Force Approach:
// Time Complexity: O(min(a, b))
// Space Complexity: O(1)

//import java.util.*;
//
//public class Q07_GCD {
//    public static int gcd(int a, int b) {
//        int smallerNum = Math.min(a, b);
//        int gcd = 0;
//        for (int i = 1; i <= smallerNum; i++) {
//            if (a % i == 0 && b % i == 0){
//                gcd = i;
//            }
//        }
//        return gcd;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int b = sc.nextInt();
//        System.out.println("The GCD of " + a + " and " + b + " is " + gcd(a, b));
//        sc.close();
//    }
//}

//Optimized Approach:
//Euclidean Algorithm
// Time Complexity: O(log(min(a, b)))
// Space Complexity: O(1)

import java.util.Scanner;

public class Q07_GCD {
    public static int gcd(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The gcd of " + a + " and " + b + " is " + gcd(a, b));
        sc.close();
    }
}