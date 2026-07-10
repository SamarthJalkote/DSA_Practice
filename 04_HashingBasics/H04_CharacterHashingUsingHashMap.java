//        Enter the string : asdaahkasdfjkkhfd
//        Enter the number of queries : 10
//        Enter the query : a
//        Frequency : 4
//        Enter the query : d
//        Frequency : 3
//        Enter the query : f
//        Frequency : 2
//        Enter the query : k
//        Frequency : 3
//        Enter the query : s
//        Frequency : 2
//        Enter the query : fd
//        Frequency : 2
//        Enter the query : as
//        Frequency : 4
//        Enter the query : d
//        Frequency : 3
//        Enter the query : t
//        Frequency : 0
//        Enter the query : i
//        Frequency : 0

import java.util.HashMap;
import java.util.Scanner;

public class H04_CharacterHashingUsingHashMap {

    public static void characterHashing(String s, int q, Scanner sc) {
        HashMap<Character, Integer> map = new HashMap<>();

        //this is for building the frequency map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        while (q-- > 0) {
            System.out.print("Enter the query : ");
            char c = sc.next().charAt(0);

            System.out.println("Frequency : " + map.getOrDefault(c, 0));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        System.out.print("Enter the number of queries : ");
        int q = sc.nextInt();
        characterHashing(s, q, sc);
        sc.close();
    }
}
