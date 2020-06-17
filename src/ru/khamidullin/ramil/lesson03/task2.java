package ru.khamidullin.ramil.lesson03;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = 0.87; //НДФЛ
        System.out.println("Зарлата на руки равна " + a*b + " рублей");
    }
}