//        Enter the number of rows: 4
//        A
//        B B
//        C C C
//        D D D D

import java.util.*;

public class P16_RepeatedAlphabetTriangle {
    public static void print_repeated_alphabet_triangle(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_repeated_alphabet_triangle(rows);
        sc.close();
    }
}
