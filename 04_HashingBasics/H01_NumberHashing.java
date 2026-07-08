//        Enter the size of array : 10
//        Enter the array elements : 1 5 7 8 6 4 2 1 2 1
//        Enter the number of queries : 10
//        Enter the query : 5
//        Frequencies : 1
//        Enter the query : 2
//        Frequencies : 2
//        Enter the query : 1
//        Frequencies : 3
//        Enter the query : 7
//        Frequencies : 1
//        Enter the query : 6
//        Frequencies : 1
//        Enter the query : 4
//        Frequencies : 1
//        Enter the query : 2
//        Frequencies : 2
//        Enter the query : 0
//        Frequencies : 0
//        Enter the query : 6
//        Frequencies : 1
//        Enter the query : 8
//        Frequencies : 1

// Time Complexity:
// Building Hash Array: O(N)
// Each Query: O(1)
// Total: O(N + Q)
//
// Space Complexity: O(1)
// (Uses a fixed-size hash array)

import java.util.Scanner;

public class H01_NumberHashing {
    public static void numberHashing(int arr[], int q, Scanner sc) {

        int[] hash = new int[100];  // This is to create an hash array,,,in it you can set the size as the biggest element in given array + 1;

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++; // This is to store the frequencies;
        }

        while (q-- > 0) {
            System.out.print("Enter the query : ");
            int queNum = sc.nextInt();

            System.out.println("Frequencies : " + hash[queNum]);
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

        System.out.print("Enter the number of queries : ");
        int queries = sc.nextInt();
        numberHashing(arr, queries, sc);
        sc.close();
    }
}
