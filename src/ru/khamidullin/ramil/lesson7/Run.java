package ru.khamidullin.ramil.lesson7;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ViewMenu viewMenu = new ViewMenu();
        System.out.println("Меню напитков: ");
        for (Menu menu : Menu.values()) {
            System.out.print(menu + " ");
            System.out.print(menu.getPrice() + " ");
            System.out.println(menu.getNumberOfDrink());
        }
        DepositMoney depositMoney = new DepositMoney();
        int startingBalance = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Внесите деньги. Внимание! Автомат не выдает сдачи.");
        int money = s.nextInt();
        System.out.println(money <= 0 ? "Вы не внесли деньги" : "Вы внесли " + money);

        int balance = startingBalance + money;
        System.out.println("Баланс " + balance);
        System.out.println("Выберите номер напитка:");

        Scanner number = new Scanner(System.in);
        Menu numberOfDrink = Menu.values()[number.nextInt()];
        System.out.println(number.nextInt() > 3 ? "Вы выбрали несуществующий напиток" : "Вы выбрали " + numberOfDrink);
        //Menu menu = new Menu();
        //if (balance <= menu.getPrice()) {
        //    System.out.println("Вы внесли недостаточно денег");
        //}
        }
    }
