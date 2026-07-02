//        Enter a number: 5
//        5
//        4
//        3
//        2
//        1

import java.util.Scanner;

public class R02_PrintNTo1 {
    public static void printNum(int a, int b) {
        if (a >= b) {
            System.out.println(a);
            printNum(a - 1, b);
        } else return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        printNum(a, 1);
        sc.close();
    }
}

//IF YOU ARE ALWAYS PRINTING TILL 1,,, THEN NO NEED TO PASS ANOTHER PARAMETER FOR 1,,,

//import java.util.Scanner;
//
//public class R02_PrintNTo1 {
//    public static void printNum(int a){
//        if (a == 0){
//            return;
//        }else System.out.println(a);
//        printNum(a-1);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int a = sc.nextInt();
//        printNum(a);
//        sc.close();
//    }
//}
