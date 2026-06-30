// Time Complexity: O(N)
// Space Complexity: O(1)

//import java.util.*;
//
//public class Q05_PrimeNumber {
//    public static boolean isPrime(int num){
//        int count = 0;
//        if ( num <= 1 ){
//            return false;
//        }else {
//            for ( int i = 1; i <= num; i++ ){
//                if ( num % i == 0 ){
//                    count++;
//                }
//            }
//        }
//        return count == 2;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number to check if it is prime or not: ");
//        int num = sc.nextInt();
//        if (isPrime(num)) {
//            System.out.println(num +" is a prime number");
//        } else {
//            System.out.println(num +" is not a prime number");
//        }
//        sc.close();
//    }
//}

//Instead of counting all factors, think:
//
//The moment I find a divisor other than 1 and itself, I already know it's not prime. Why continue?
//public static boolean isPrime(int number) {
//    if (number <= 1) {
//        return false;
//    }
//    for (int i = 2; i < number; i++) {
//        if (number % i == 0) {
//            return false;
//        }
//    }
//    return true;
//}
//Time: O(N)
//Space: O(1)

// ⭐Optimized Code

//Factors always occur in pairs. Once we cross √N, every new factor would have
//already been paired with a smaller factor that we checked earlier.
//Therefore, it's sufficient to check divisibility only up to √N.

// Time Complexity: O(√N)
// Space Complexity: O(1)

import java.util.*;

public class Q05_PrimeNumber {
    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }
}