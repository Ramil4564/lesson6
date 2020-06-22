package ru.khamidullin.ramil.lesson04;


import java.util.Locale;
import java.util.Scanner;

public class Task04_GeometricAndArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter please the type of progression: a - 'arithmetic', g - 'geometric'");
        String typeOfProgression = scanner.next();
        double firstTerm;
        double denominator;
        double difference;
        double numberOfTerms;
        switch (typeOfProgression) {
            case "g": {
                firstTerm = scanner.nextDouble();
                denominator = scanner.nextDouble();
                numberOfTerms = scanner.nextDouble();
                System.out.print(firstTerm);
                while (numberOfTerms-- > 1) {
                    firstTerm = firstTerm * denominator;
                    System.out.printf(" %f", firstTerm);
                    //break;
                }
            }
            case "a": {
                firstTerm = scanner.nextDouble();
                difference = scanner.nextDouble();
                numberOfTerms = scanner.nextDouble();
                System.out.print(firstTerm);
                while (numberOfTerms-- > 1) {
                    firstTerm = firstTerm + difference;
                    System.out.printf(" %f", firstTerm);
                    //break;
                }
//                default: {
//                    System.out.println("");
//                }
            }
            System.out.println();
        }
    }
}
