//        Enter the number of rows: 5
//             *
//            ***
//           *****
//          *******
//         *********
//        Time Complexity: O(n²)
//        Space Complexity: O(1)

import java.util.*;

public class P07_StarPyramid {
    public static void print_star_pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_star_pyramid(rows);
        sc.close();
    }
}
