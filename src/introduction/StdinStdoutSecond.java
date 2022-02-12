package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-Feb-22
 */

import java.util.Scanner;

public class StdinStdoutSecond {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double db = scan.nextDouble();
        scan.nextLine();
        String string = scan.nextLine();
        System.out.println("String: " + string);
        System.out.println("Double: " + db);
        System.out.println("Int: " + num);
    }
}
