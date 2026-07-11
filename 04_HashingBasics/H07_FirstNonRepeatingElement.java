//        Enter the size of array : 10
//        Enter the array elements : 1 2 3 1 8 2 6 3 7 2
//        First Non-Repeating Elements : 8

import java.util.*;

public class H07_FirstNonRepeatingElement {

    public static void firstNonRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println("First Non-Repeating Elements : " + num);
                return;
            }
        }
        System.out.println("No Non-Repeating elements found.");
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
        firstNonRepeatingElement(arr);
        sc.close();
    }
}
