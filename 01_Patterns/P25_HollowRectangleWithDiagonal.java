//        Enter the number of rows : 5
//        * * * * *
//        * *     *
//        *   *   *
//        *     * *
//        * * * * *

// Time Complexity: O(N²)
// Space Complexity: O(1)

import java.util.Scanner;

public class P25_HollowRectangleWithDiagonal {
    public static void print_rec_with_dia(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == j) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        print_rec_with_dia(rows);
        sc.close();
    }
}
