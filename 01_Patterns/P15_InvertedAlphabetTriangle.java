//        Enter the number of rows: 4
//        A B C D
//        A B C
//        A B
//        A

import java.util.Scanner;

public class P15_InvertedAlphabetTriangle {
    public static void print_inverted_aplha_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';                     //for (char ch = 'A'; ch < 'A' + (n - i); ch++) {
            for (int j = n; j >= i; j--) {          //System.out.print(ch + " ");
                System.out.print(ch + " ");      //}
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_inverted_aplha_triangle(rows);
        sc.close();
    }
}
