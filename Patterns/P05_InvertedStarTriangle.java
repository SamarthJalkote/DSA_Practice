//        Enter the number of rows: 5
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        Time Complexity: O(n²)
//        Space Complexity: O(1)

import java.util.*;

public class P05_InvertedStarTriangle {
    public static void print_inverted_star_triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("* ");
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

//for (int i = 5; i >= 1; i--) {                 HERE THE LOOPING IS BACKWARD
//        for (int j = i; j >= 1; j--) {
//        System.out.print("* ");
//            }
//                    System.out.println();
//        }