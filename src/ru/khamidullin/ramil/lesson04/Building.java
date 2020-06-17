package ru.khamidullin.ramil.lesson04;

public class Building {
    Material[] materials;
    public Building() {
        materials = new Material[2];
        materials[0] = new Material();
        materials[0].cost = 1000;
        materials[1] = new Material();
        materials[1].cost = 100;
    }
    public int getPrice() {
        int sum = 0;
        for(Material m : materials) {
            sum += m.cost;

        }
        return sum;
    }
  //  public int getCastomerPrice();{
   //     return getPrice()*2;
   // }


}
