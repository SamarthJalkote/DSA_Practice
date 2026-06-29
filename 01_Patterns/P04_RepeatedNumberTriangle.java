//        Enter the number of rows: 5
//        1
//        22
//        333
//        4444
//        55555

import java.util.Scanner;

public class P04_RepeatedNumberTriangle {
    public static void print_repeated_number_triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_repeated_number_triangle(rows);
        sc.close();
    }
}
