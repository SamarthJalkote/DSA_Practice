//Enter a number: 153
//153 is a Armstrong number.

//Time Complexity: O(log n)
//Space Complexity: O(1)


import java.util.*;

public class Q04_ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int originalNum = number;
        int count = 0;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            count++;
            number /= 10;
        }
        number = originalNum;
        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, count);
            number /= 10;
        }
        return originalNum == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is a Armstrong number.");
        } else {
            System.out.println(num + " is not a Armstrong number.");
        }
        sc.close();

    }
}
