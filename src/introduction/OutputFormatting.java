package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-Feb-22
 */

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = scanner.next();
            int n = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s1, n);
        }
        System.out.println("================================");


    }

}
