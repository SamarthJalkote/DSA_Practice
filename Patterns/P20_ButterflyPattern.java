//        Enter the number of rows for the butterfly pattern: 5
//        *                 *
//        * *             * *
//        * * *         * * *
//        * * * *     * * * *
//        * * * * * * * * * *
//        * * * *     * * * *
//        * * *         * * *
//        * *             * *
//        *                 *

import java.util.Scanner;

public class P20_ButterflyPattern {
    public static void print_butterfly_pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            //stars
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            //spaces
            int spaces = 2 * (n - stars);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the butterfly pattern: ");
        int rows = sc.nextInt();
        print_butterfly_pattern(rows);
        sc.close();
    }
}

//int stars;
//int spaces;
//
//if (i <= n) {
//stars = i;
//spaces = 2 * (n - i);
//        } else {
//stars = 2 * n - i;
//spaces = 2 * (i - n);
//        }


//                         OR

//if (i < n) {
//spaces -= 2;
//        } else {
//spaces += 2;
//        }

