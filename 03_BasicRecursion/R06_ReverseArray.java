//Enter the size of array: 5
//Enter the elements:
//1
//2
//3
//4
//5
//Reversed Array:
//5 4 3 2 1

import java.util.Scanner;

public class R06_ReverseArray {
    public static void reverseArray(int[] arr, int start, int last) {
        if (start >= last) {
            return;   // if the if statement already returns something,,then no need for else,, you can write directly..
        } else {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            reverseArray(arr, start + 1, last - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, n - 1);
        System.out.println("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
