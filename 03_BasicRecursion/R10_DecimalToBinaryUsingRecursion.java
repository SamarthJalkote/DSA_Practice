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
        print_Ans(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        print_Ans(num);
        sc.close();
    }
}