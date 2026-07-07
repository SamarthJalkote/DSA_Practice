//A Harshad Number(Niven number) is a number that is divisible by the sum of its digits.

//Enter the number : 18
//18 is a Niven Number

import java.util.*;


public class Q19_HarshadNumber {

    public static boolean print_harshad_num(int n) {
        int originalNum = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return (originalNum % sum == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (print_harshad_num(num)) System.out.println(num + " is a Niven Number");
        else System.out.println(num + " is not a Niven Number.");
        sc.close();
    }

}
