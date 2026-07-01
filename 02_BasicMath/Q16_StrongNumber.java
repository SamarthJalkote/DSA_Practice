//A Strong Number is a number whose sum of the factorials of its digits is equal to the original number.
//Enter a number: 145
//145 is a strong number

import java.util.Scanner;

public class Q16_StrongNumber {
    public static int strongNum(int n) {
        int sum = 0;
        while (n > 0) {
            int factorial = 1;
            int digit = n % 10;
            n = n / 10;
            for (int i = digit; i > 0; i--) {
                factorial *= i;
            }
            sum += factorial;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = strongNum(num);
        if (result == num) {
            System.out.println(num + " is a strong number");
        } else System.out.println(num + " is not a strong number");
        sc.close();
    }
}
