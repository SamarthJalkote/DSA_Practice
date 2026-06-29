//        Enter the number of rows: 4
//        A
//        A B
//        A B C
//        A B C D

import java.util.Scanner;

public class P14_AlphabetTriangle {
    public static void print_alphabet_triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_alphabet_triangle(rows);
        sc.close();
    }
}

//for (int i = 1; i <= n; i++) {
//   char ch = 'A';             // CRITICAL: Reset back to 'A' (65) at the start of EVERY new row
//        for (int j = 1; j <= i; j++) {   // Inner loop handles printing columns for the current row
//         System.out.print(ch + " ");
//         ch++; // Moves to 'B', 'C', 'D', etc., just for this row
//        }
//        System.out.println();
//}
