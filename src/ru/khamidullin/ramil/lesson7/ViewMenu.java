package ru.khamidullin.ramil.lesson7;

public class ViewMenu {
    public static void main(String[] args) {

        System.out.println("Меню напитков: ");
        for (Menu menu : Menu.values()) {
            System.out.print(menu + " ");
            System.out.print(menu.getPrice() + " ");
            System.out.print(menu.ordinal() + " ");
            System.out.println(menu.getNumberOfDrink() + " ");

        }

    }
}
enum Menu {
    ESPRESSO(35, 0),
    AMERICANO(40, 1),
    CAPPUCCINO(45, 2),
    LATTE(50, 3);

    int price;
    int numberOfDrink;

    Menu(int price, int numberOfDrink) {
        this.price = price;
        this.numberOfDrink = numberOfDrink;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfDrink() {
        return numberOfDrink;
    }
}
