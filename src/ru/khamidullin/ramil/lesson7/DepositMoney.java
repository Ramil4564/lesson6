package ru.khamidullin.ramil.lesson7;

import java.util.Scanner;

public class DepositMoney {
    public static void main(String[] args) {

        int startingBalance = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Внесите деньги. Внимание! Автомат не выдает сдачи.");
        int money = s.nextInt();
        System.out.println("Вы внесли " + money);
        int balance = startingBalance + money;
        System.out.println("Баланс " + balance);




    }

}