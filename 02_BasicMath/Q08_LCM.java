//Enter the first number: 12
//Enter the second number: 18
//The LCM of 12 and 18 is 36

//Brute Force Approach:
// Time Complexity: Very High (depends on the numbers)
// Space Complexity: O(1)

//import java.util.Scanner;
//
//public class Q08_LCM {
//    public static int lcm(int a, int b) {
//        int largerNum = Math.max(a, b);
//        int lcm = 0;
//        for (int i = largerNum; ; i++){  // this intentionally creates a infinite loop, but we will break it when we find the lcm;
//            if (i % a == 0 && i % b == 0){ // or we can use i <= a * b; bcoz lcm is always not greater than a * b;
//                lcm = i;
//                break;
//            }
//        }
//        return lcm;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int b = sc.nextInt();
//        System.out.println("The LCM of " + a + " and " + b + " is " + lcm(a, b));
//        sc.close();
//
//    }
//}


//Optimized Approach:
//Euclidean Algorithm
// Time Complexity: O(log(min(a, b)))
// Space Complexity: O(1)

import java.util.Scanner;

public class Q08_LCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
        sc.close();

    }
}