package ru.khamidullin.ramil.lesson06;

public class BakeryProducts extends Products{
    private String name = "Выпечка";
    public String getName(){
        return name;
    }
    public void price(){
        System.out.println("Цена выпечки");
    }
        public void taste(){
        System.out.println("Вкус выпечки");
    }

}
