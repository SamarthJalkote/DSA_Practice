//        Best	O(N)
//        Average	O(N²)
//        Worst	O(N²)
//        Space	O(1)

//        Enter the size of array : 5
//        Enter the array elements :
//        12 8 66 42 1
//        Sorted array is :
//        1
//        8
//        12
//        42
//        66

import java.util.Scanner;

public class S04_InsertionSort {
    public static void sortIt(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array is : ");

        sortIt(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}
