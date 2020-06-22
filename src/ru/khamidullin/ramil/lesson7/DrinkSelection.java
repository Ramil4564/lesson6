package ru.khamidullin.ramil.lesson7;


import java.util.Scanner;

public class DrinkSelection {
    public static void main(String[] args) {
        DepositMoney depositMoney = new DepositMoney();
        ViewMenu viewMenu = new ViewMenu();
        //Menu menu = Menu.ESPRESSO;
        System.out.println("Выберите номер напитка:");

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();



//        for (Menu menu : Menu.values()) {
//            System.out.println("Вы выбрали " + menu.ordinal);
//        }



//        switch (menu) {
//            case ESPRESSO:
//                System.out.println("Вы выбрали Espresso");
//                break;
//        }
    }

}
