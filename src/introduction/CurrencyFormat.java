package introduction;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 15-Feb-22
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double note = scanner.nextDouble();
        scanner.close();
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + u.format(note));
        System.out.println("India: " + i.format(note));
        System.out.println("China: " + c.format(note));
        System.out.println("France: " + f.format(note));

    }
}
