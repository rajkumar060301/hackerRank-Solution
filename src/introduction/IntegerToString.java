package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 15-Feb-22
 */

import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String s = String.valueOf(number);
        if (scanner.hasNext(s))
            System.out.println("Wrong answer");
        else
            System.out.println("Good job");
    }
}
