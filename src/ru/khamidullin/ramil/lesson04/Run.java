package ru.khamidullin.ramil.lesson04;
import ru.khamidullin.ramil.lesson04.Building;
import ru.khamidullin.ramil.lesson04.Material;
public class Run {
    public static void main(String[] args) {
        Building building = new Building();
        int sum = 0;
        for(Material m : building.materials){
            sum = m.cost;
        }
        System.out.println("1. price: "+sum);
        System.out.println("2. price: "+building.getPrice());
        //System.out.println("3. price: "+building.getCastomerPrice());

    }
}
