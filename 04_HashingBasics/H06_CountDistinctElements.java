//        Enter the size of array : 5
//        Enter the array elements : 1 2 4 1 3
//        1
//        2
//        3
//        4

import java.util.*;

public class H06_CountDistinctElements {
    public static void countDistinctElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //System.out.print(map.size()); -------> this tell the array size of the HastMap

        for (int key : map.keySet()) {
            System.out.println(key);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        countDistinctElements(arr);
        sc.close();
    }
}

//keySet()
//It returns all the keys present in the HashMap.
