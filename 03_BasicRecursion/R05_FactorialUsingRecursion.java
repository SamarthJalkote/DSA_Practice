//Enter the number: 5
//Factorial of 5 is 120

import java.util.Scanner;

public class R05_FactorialUsingRecursion {
    public static int printFactorial(int a) {
        if (a == 0) {                      // if (a == 0)
            return 1;         // OR       //     return 1;
        } else {                           // return a * printFactorial(a - 1);
            return a * printFactorial(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + printFactorial(num));
        sc.close();
    }
}



