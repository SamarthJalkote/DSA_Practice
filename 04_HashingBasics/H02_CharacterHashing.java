//        Enter the string : samarth
//        Enter the number of queries : 5
//        Enter the query : a
//        Frequencies : 2
//        Enter the query : s
//        Frequencies : 1
//        Enter the query : t
//        Frequencies : 1
//        Enter the query : h
//        Frequencies : 1
//        Enter the query : q
//        Frequencies : 0

// Building Hash: O(N)
// Each Query: O(1)
// Total: O(N + Q)

// Space Complexity: O(26) = O(1)


import java.util.Scanner;

public class H02_CharacterHashing {
    public static void charHashing(int q, String s, Scanner sc) {
        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        while (q-- > 0) {
            System.out.print("Enter the query : ");
            char c = sc.next().charAt(0);

            System.out.println("Frequencies : " + hash[c - 'a']);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        System.out.print("Enter the number of queries : ");
        int q = sc.nextInt();
        charHashing(q, s, sc);
        sc.close();
    }
}
