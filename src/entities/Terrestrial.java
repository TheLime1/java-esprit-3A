package entities;

import enums.Food;
import interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private String landType;

    public Terrestrial(String family, String name, int age, boolean isMammal, String landType) {
        super(family, name, age, isMammal);
        this.landType = landType;
    }

    @Override
    public void makeSound() {
        System.out.println("Terrestrial animal sound!");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " cannot eat this food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " is eating plants.");
        } else {
            System.out.println(name + " cannot eat this food.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println(name + " is eating both plants and meat.");
    }
}
