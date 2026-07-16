//        Enter the size of array : 5
//        Enter the array elements : 8 1 3 9 0
//        Sorted Array:
//        0 1 3 8 9

//Time Complexity:
//Best Case:O(N²)
//Average Case:O(N²)
//Worst Case:O(N²)
//
//Space Complexity:O(1)

import java.util.Scanner;

public class S01_SelectionSort {
    public static void sortIt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted Array:");
        sortIt(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();

    }
}
