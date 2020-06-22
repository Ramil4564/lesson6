package ru.khamidullin.ramil.lesson04;

public class Task04 { //арифметическая прогрессия
    public static void main(String[] args) {
        String type = args[0];
        int firstTerm = Integer.parseInt(args[1]);
        int difference = Integer.parseInt(args[2]);
        int numberOfTerms = Integer.parseInt(args[3]);
        System.out.print(firstTerm);
        while (numberOfTerms-- > 1) {
            System.out.printf(" %d", (firstTerm += difference));
        }
        System.out.println();
    }
}
