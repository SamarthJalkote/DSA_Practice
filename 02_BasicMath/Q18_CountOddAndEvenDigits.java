//Enter a number: 123
//Odd digits: 2
//Even digits: 1

import java.util.Scanner;

public class Q18_CountOddAndEvenDigits {
    public static void numOddAndEvenDigits(int n) {
        int oddCount = 0;
        int evenCount = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else oddCount++;
        }
        System.out.println("Odd digits: " + oddCount);
        System.out.println("Even digits: " + evenCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        numOddAndEvenDigits(num);
        sc.close();
    }
}
