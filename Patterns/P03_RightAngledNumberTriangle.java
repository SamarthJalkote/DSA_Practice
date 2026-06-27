//        Enter the number of rows: 5
//        1
//        12
//        123
//        1234
//        12345

import java.util.Scanner;

public class P03_RightAngledNumberTriangle {
    public static void print_number_triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_number_triangle(rows);
    }
}
