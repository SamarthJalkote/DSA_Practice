//Print all even numbers from N down to 0 using recursion.


import java.util.Scanner;

public class R09_PrintEvenNumbersUsingRecursion {
    public static void print_answer(int a) {
        if (a < 0)
            return;
        if (a % 2 == 0) System.out.println(a);
        print_answer(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(N) : ");
        int num = sc.nextInt();
        print_answer(num);
        sc.close();
    }
}
