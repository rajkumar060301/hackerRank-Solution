package string;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-Feb-22
 */

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();
        int sum = A.length() + B.length();
        int x = A.length();
        int y = B.length();
        System.out.println(sum);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        String str1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String str2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(str1 + " " + str2);

    }
}
