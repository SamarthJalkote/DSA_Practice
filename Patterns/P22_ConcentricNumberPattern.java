//        Enter the number of rows: 4
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

import java.util.Scanner;

import static java.lang.Math.min;

public class P22_ConcentricNumberPattern {
    public static void print_number_pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int top = i - 1;
                int left = j - 1;
                int right = (2 * n - 1) - j;
                int bottom = (2 * n - 1) - i;
                System.out.print(n - min(min(top, bottom), min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_number_pattern(rows);
        sc.close();
    }
}

// find an easier intermediate representation, then transform it into the answer you need.
