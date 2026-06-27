//        Enter the number of rows: 5
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
//        Time Complexity: O(n²)
//        Space Complexity: O(1

import java.util.*;

public class P06_InvertedNumberTriangle {
    public static void print_inverted_number_triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_inverted_number_triangle(rows);
        sc.close();
    }
}
