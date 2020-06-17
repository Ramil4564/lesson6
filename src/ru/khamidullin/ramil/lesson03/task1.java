package ru.khamidullin.ramil.lesson03;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//количество литров
        int b = 42; //цена за 1 литр
        int c = a*b; //стоимость бензина
        System.out.println("Стоимость бензина равна " + c + " рублей");
    }
}