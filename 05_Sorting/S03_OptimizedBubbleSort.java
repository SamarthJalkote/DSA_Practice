//        Best Case	O(N)
//        Average Case	O(N²)
//        Worst Case	O(N²)
//        Space	O(1)

//        Enter the array size : 5
//        Enter the array elements :
//        12
//        8
//        1
//        50
//        9
//        Sorted array is :
//        1
//        8
//        9
//        12
//        50

import java.util.Scanner;

public class S03_OptimizedBubbleSort {
    public static void sortIt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
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
