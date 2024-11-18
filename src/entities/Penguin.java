package entities;

import enums.Food;
import interfaces.Carnivore;

public class Penguin extends Aquatic implements Carnivore<Food> {
    public Penguin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin sound!");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " cannot eat this food.");
        }
    }
}
