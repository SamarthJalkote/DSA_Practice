//Enter the number: 12345
//Number of digits in this number are: 5
//Time Complexity = O(log₁₀N)
//Space Complexity = O(1)

import java.util.Scanner;

public class Q01_CountDigits {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            //int lastDigit = num % 10;
            count += 1;
            // System.out.println(lastDigit);
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Number of digits in this number are: " + countDigits(num));
        sc.close();

    }
}
