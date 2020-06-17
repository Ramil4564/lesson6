package ru.khamidullin.ramil.lesson03;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt(); //количество секунд
        double b = a/3600; //количество часов
        System.out.println(b);

    }
}
