package ru.khamidullin.ramil.lesson06;

import static ru.khamidullin.ramil.lesson06.BakeryProducts.*;

public class Main {
    public static void main(String[] args) {
        BakeryProducts bakeryProducts = new BakeryProducts();
        bakeryProducts.price();
        bakeryProducts.size();
        bakeryProducts.taste();
        System.out.println(bakeryProducts.getName());

        Products products = new BakeryProducts();
        products.price();




    }
}
