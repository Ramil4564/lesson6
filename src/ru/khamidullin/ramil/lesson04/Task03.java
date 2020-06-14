package ru.khamidullin.ramil.lesson04;

public class Task03 {


    public static void main(String[] args) {

        System.out.println("\t");

        for (int i = 0; i <= 10; i++) {

            System.out.format("%d\t", i);
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d", i);

            for (int j = 1; j <= 10; j++) {

                System.out.format("\t%d", i * j);
            }

            System.out.println();
        }
    }
}
