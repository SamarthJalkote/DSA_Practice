//        Enter the number of rows: 4
//        1      1
//        12    21
//        123  321
//        12344321

import java.util.*;

public class P12_NumberCrownPattern {
    public static void print_number_crown_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_number_crown_pattern(rows);
        sc.close();
    }
}
