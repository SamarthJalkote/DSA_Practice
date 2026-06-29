//        Enter the side of the square: 4
//        * * * *
//        *     *
//        *     *
//        * * * *

import java.util.Scanner;

public class P21_HollowSquarePattern {
    public static void print_hollow_square_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();
        print_hollow_square_pattern(side);
        sc.close();
    }
}
