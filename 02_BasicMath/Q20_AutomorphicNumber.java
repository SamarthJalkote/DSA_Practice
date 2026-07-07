//An Automorphic Number is a number whose square ends with the number itself.

import java.util.Scanner;

public class Q20_AutomorphicNumber {
    public static boolean automorphic_Num(int n) {
        int originalNum = n;
        int square = n * n;
        int digits = 0;
        while (n > 0) {
            digits++;
            n /= 10;
        }
        int divisor = (int) Math.pow(10, digits);
        return (square % divisor) == originalNum;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (automorphic_Num(num)) System.out.println(num + " is a Automorphic Number.");
        else System.out.println(num + " is not a Automorphic Number.");
        sc.close();

    }
}
