package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 15-Feb-22
 */

import java.util.Scanner;

public class StaticInitializerBlock {
    static Scanner scanner = new Scanner(System.in);
    public static int num1 = scanner.nextInt();
    public static int num2 = scanner.nextInt();

    public static void main(String[] args) {
        int area = num1 * num2;
        if (area > 0 && num1 >= 0 && num2 >= 0) {
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
