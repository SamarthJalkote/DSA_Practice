//Enter the number whose divisors you want to print: 18
//Divisors of 18 are:
//1 2 3 6 9 18

//Brute Force Approach:
// Time Complexity: O(N)
// Space Complexity: O(1)

//import java.util.Scanner;
//
//public class Q06_PrintAllDivisors {
//    public static void printDivisors(int number){
//        for (int i = 1; i <= number; i++){
//            if (number % i == 0){
//                System.out.print(i + " ");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number whose divisors you want to print: ");
//        int num = sc.nextInt();
//        System.out.println("Divisors of " + num + " are: ");
//        printDivisors(num);
//        sc.close();
//    }
//}

//Optimized Approach:
// Time Complexity: O(√N)
// Space Complexity: O(1)

import java.util.*;

public class Q06_PrintAllDivisors {
    public static void printDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose divisors you want to print: ");
        int number = sc.nextInt();
        System.out.println("Divisors of " + number + " are: ");
        printDivisors(number);
        sc.close();
    }
}
