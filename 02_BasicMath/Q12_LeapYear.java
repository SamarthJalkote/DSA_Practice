//Enter a year: 2026
//2026 is not a Leap Year

// Time Complexity: O(1)
// Space Complexity: O(1)

import java.util.Scanner;

public class Q12_LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        sc.close();
    }
}
