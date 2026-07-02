//        Enter a number: 5
//        1
//        2
//        3
//        4
//        5

import java.util.Scanner;

public class R03_PrintNto1ByBackTracking {
    public static void printNum(int current, int a) {
        if (current < 1) {
            return;
        } else printNum(current - 1, a);
        System.out.println(current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        printNum(a, a);
        sc.close();
    }
}
