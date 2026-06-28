//        Enter the number of rows: 4
//           A
//          ABA
//         ABCBA
//        ABCDCBA

import java.util.Scanner;

public class P17_AlphabetPyramid {
    public static void print_alphabet_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //alphabets
            char ch = 'A';
            int breakpoint = (2 * i - 1) / 2;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_alphabet_pyramid(rows);
        sc.close();

    }
}

