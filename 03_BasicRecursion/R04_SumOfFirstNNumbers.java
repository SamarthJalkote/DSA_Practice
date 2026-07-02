//Enter the number: 5
//Sum of 5 numbers is 15

//FUNCTIONAL RECURSION:

import java.util.Scanner;

public class R04_SumOfFirstNNumbers {
    public static int printSum(int a) {
        if (a == 0) return 0;
        else return a + printSum(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " numbers is " + printSum(n));
        sc.close();
    }
}

// Parameterized Recursion:

//public class R04_SumOfFirstNNumbers {
//    public static void printSum(int a, int sum){
//        if (a == 0){
//            System.out.println("Sum is: " + sum);
//            return;
//        }else {
//            printSum(a-1,sum+a);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        printSum(n,0);
//        sc.close();
//    }
//}

