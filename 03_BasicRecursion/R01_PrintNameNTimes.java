//        Enter a name: T
//        Enter a number: 5
//        T
//        T
//        T
//        T
//        T

import java.util.Scanner;

public class R01_PrintNameNTimes {
    public static void printName(int i, int num, String name) {
        if (i > num) {
            return;
        } else System.out.println(name);
        printName(i + 1, num, name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printName(1, num, name);
        sc.close();
    }
}
