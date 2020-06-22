package ru.khamidullin.ramil.lesson04;

import java.util.Locale;
import java.util.Scanner;

public class Task04_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String s = scanner.next();
        double firstTerm = scanner.nextDouble();
        double denominator = scanner.nextDouble();
        int numberOfTerms = scanner.nextInt();
        System.out.print(firstTerm);
        while (numberOfTerms-- > 1) {
            firstTerm = firstTerm * denominator;
            System.out.printf(" %f", firstTerm);
        }
        System.out.println();
    }
}
