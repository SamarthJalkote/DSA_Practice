//     Enter the number of rows: 5
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

import java.util.Scanner;

public class P02_RightAngledStarTriangle {
    public static void print_star_triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_star_triangle(rows);
        sc.close();

    }
}
