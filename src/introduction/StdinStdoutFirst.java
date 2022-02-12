package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-Feb-22
 */

import java.util.Scanner;

public class StdinStdoutFirst {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);

    }
}
