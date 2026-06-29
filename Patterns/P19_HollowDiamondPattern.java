//        Enter the number of rows: 5
//        * * * * * * * * * *
//        * * * *     * * * *
//        * * *         * * *
//        * *             * *
//        *                 *
//        *                 *
//        * *             * *
//        * * *         * * *
//        * * * *     * * * *
//        * * * * * * * * * *

import java.util.Scanner;

public class P19_HollowDiamondPattern {
    public static void print_hollow_diamond_pattern(int n) {
        // upper half
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            //spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower half
        for (int i = 1; i <= n; i++) { // initialize the loop with i = 2; to avoid duplicate stars at the center of the pattern
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_hollow_diamond_pattern(rows);
        sc.close();
    }
}
//                  Upper Half
//        | Component   | Formula        |
//        | ----------- | -------------- |
//        | Left Stars  | `rows - i + 1` |
//        | Spaces      | `2 * (i - 1)`  |
//        | Right Stars | `rows - i + 1` |
//                  Lower Half
//        | Component   | Formula          |
//        | ----------- | ---------------- |
//        | Left Stars  | `i`              |
//        | Spaces      | `2 * (rows - i)` |
//        | Right Stars | `i`              |

