package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-Feb-22
 */

import java.util.Scanner;

public class LoopFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " " + " = " + i * n);
        }
    }
}
