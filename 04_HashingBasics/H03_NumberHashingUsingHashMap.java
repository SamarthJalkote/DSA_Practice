// Number Hashing using HashMap

import java.util.HashMap;
import java.util.Scanner;

public class H03_NumberHashingUsingHashMap {

    public static void numberHashing(int[] arr, int q, Scanner sc) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Build the frequency map
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Answer the queries
        while (q-- > 0) {
            System.out.print("Enter the query: ");
            int number = sc.nextInt();

            System.out.println("Frequency: " + map.getOrDefault(number, 0));
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

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        numberHashing(arr, q, sc);

        sc.close();
    }
}

//put(key, value)
//Adds a new key-value pair or updates an existing key.

//get(key)
//Returns the value of a key.If key does not exist,, returns null

//getOrDefault(key, defaultValue)
//If key exists, return its value. Otherwise returns 0.

//map.put(num, map.getOrDefault(num,0)+1);
//Find the current frequency of num. If it doesn't exist, assume it's 0.
//Then add 1 and store the updated frequency back in the map.

//containsKey(key)
//Checks whether the key exists.