package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 14-Feb-22
 */

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();
        int i = 1;
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(i + " " + str);
            i++;
        }
    }
}
