//        Enter the array size : 5
//        Enter the array elements :
//        12
//        45
//        7
//        65
//        2
//        Sorted array is :
//        2
//        7
//        12
//        45
//        65


//        Best Case    : O(N²)
//        Average Case : O(N²)
//        Worst Case   : O(N²)
//        Space        : O(1)


import java.util.Scanner;

public class S02_BubbleSort {
    public static void sortIt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
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
