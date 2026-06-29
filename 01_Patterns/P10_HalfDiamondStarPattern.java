//        Enter the input: 5
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

//     Time Complexity: O(n²)
//     Space Complexity: O(1)

import java.util.Scanner;

public class P10_HalfDiamondStarPattern {
    public static void print_half_diamond_star_pattern(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
        print_half_diamond_star_pattern(n);
        sc.close();

    }
}
//if(i <=n)
//   stars =i;
//else
//   stars =2*n -i;