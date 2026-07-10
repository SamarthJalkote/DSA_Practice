//        Enter the size of array: 10
//        Enter the elements:
//        100 700 100 705 100 700 200 135 500 100
//        Highest Frequency Element : 100
//        Lowest Frequency Element : 705

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class H05_HighestAndLowestFrequencyElement {

    public static void highestLowestFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;

        int highestElement = -1;
        int lowestElement = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { //Visit every key-value pair stored in the HashMap.
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > highestFreq) {
                highestFreq = frequency;
                highestElement = element;
            }

            if (frequency < lowestFreq) {
                lowestFreq = frequency;
                lowestElement = element;
            }

        }
        System.out.println("Highest Frequency Element : " + highestElement);
        System.out.println("Lowest Frequency Element : " + lowestElement);
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

        highestLowestFrequency(arr);
    }
}


//entrySet()
//Returns all key-value pairs stored in the HashMap.
//SYNTAX : map.entrySet()

//getKey()
//Returns the key from the current key-value pair.
//SYNTAX : entry.getKey()

//getValue()
//Returns the value from the current key-value pair.
//SYNTAX : entry.getValue()

//This key value methods come in the entrySet method ..