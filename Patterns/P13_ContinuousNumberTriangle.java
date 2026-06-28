//        Enter the number of rows: 5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

import java.util.*;

public class P13_ContinuousNumberTriangle {
    public static void print_floyds_triangle(int n) {
        int num = 1;                       //Because int num = 1; is declared outside both loops
        for (int i = 1; i <= n; i++) {        //(at the very top of the method), it
            for (int j = 1; j <= i; j++) {   //belongs to the entire method. The outer loop
                System.out.print(num + " "); //does not reset it when a new row starts.
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        print_floyds_triangle(rows);
        sc.close();
    }
}
