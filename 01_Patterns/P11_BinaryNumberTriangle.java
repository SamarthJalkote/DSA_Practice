//        Enter the number of rows: 5
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

import java.util.*;

public class P11_BinaryNumberTriangle {
    public static void print_binary_number_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_binary_number_triangle(rows);
        sc.close();
    }
}
//public class P11_BinaryNumberTriangle {
//    public static void print_binary_number_triangle(int n) {
//        int start;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) start = 0;
//            else start = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(start + " ");
//                start = 1 - start;
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
//        int rows = sc.nextInt();
//        print_binary_number_triangle(rows);
//        sc.close();
//    }
//}