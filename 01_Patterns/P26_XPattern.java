//        Enter the number of rows : 5
//        *       *
//          *   *
//            *
//          *   *
//        *       *

import java.util.*;

public class P26_XPattern {
    public static void print_X_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        print_X_pattern(rows);
        sc.close();
    }
}
