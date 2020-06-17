package ru.khamidullin.ramil.lesson04;


import java.util.Scanner;

public class Task04_geom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int firstTerm = scanner.nextInt();

        int denominator = scanner.nextInt();

        int numberOfTerms = scanner.nextInt();

        System.out.print(firstTerm);

        while (numberOfTerms-- > 1) {

            System.out.printf(" %d", (firstTerm *= denominator));
        }

        System.out.println();
    }
}
