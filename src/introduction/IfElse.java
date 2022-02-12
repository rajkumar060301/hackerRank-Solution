package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-Feb-22
 */

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (num >= 2 && num <= 5) {
                System.out.println("Not Weird");
            } else if (num >= 6 && num <= 20) {
                System.out.println("Weird");

            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
