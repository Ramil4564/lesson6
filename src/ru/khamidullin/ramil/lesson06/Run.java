package ru.khamidullin.ramil.lesson06;

public class Run {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setPrice(45);
        product1.setSize("Big");
        System.out.println("Цена этого товара "+product1.getPrice());
        System.out.println("Размер этого товара "+product1.getSize());
    }
}

class Product{
    int price;
    String size;
    public void setPrice(int productPrice){
        price = productPrice;
    }
    public void setSize(String productSize){
        size = productSize;
    }
    public int getPrice(){
        return price;
    }
    public String getSize(){
        return size;
    }
}

class MilkProduct extends Product{
    public void size(){
        System.out.println("small");
    }
    public void price(){
        System.out.println(50);
    }

}
