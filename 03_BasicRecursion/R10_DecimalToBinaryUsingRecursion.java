//Enter the number : 13
//        1101

import java.util.Scanner;

public class R10_DecimalToBinaryUsingRecursion {
    public static void print_Ans(int n) {
        if (n == 0)
            return;
        if (n == 1) {
            System.out.print(1);
            return;
        }
        int binary = n % 2;
        int q = n / 2;
        print_Ans(q);
        System.out.print(binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        print_Ans(num);
        sc.close();
    }
}