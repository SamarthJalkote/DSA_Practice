//        Enter the number of rows: 5
//        *********
//         *******
//          *****
//           ***
//            *

// Time Complexity: O(n²)
// Space Complexity: O(1)

import java.util.Scanner;

public class P08_InvertedStarPyramid {
    public static void print_inverted_star_triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (rows - i + 1) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_inverted_star_triangle(rows);
        sc.close();

    }
}
