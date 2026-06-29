//        Enter the number of rows: 5
//        E
//        D E
//        C D E
//        B C D E
//        A B C D E

import java.util.*;

public class P18_ReverseAlphabetTriangle {
    public static void print_reverse_alphabet_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_reverse_alphabet_triangle(rows);
        sc.close();
    }
}
