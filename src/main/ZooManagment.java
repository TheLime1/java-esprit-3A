package main;

import entities.Animal;
import entities.zoo;
import entities.Aquatic;
import entities.Terrestrial;
import entities.Dolphin;
import entities.Penguin;

public class ZooManagment {
    public static void main(String[] args) {
        zoo Zoo = new zoo("MyZoo", "CityName");

        Dolphin dolphin = new Dolphin("Dolphin Family", "Dolphin", 8, true, "Sea");
        Penguin penguin1 = new Penguin("Penguin Family", "Penguin", 6, true, "Arctic");
        penguin1.setSwimmingDepth(30.5f);

        Penguin penguin2 = new Penguin("Penguin Family", "Penguin2", 7, true, "Antarctic");
        penguin2.setSwimmingDepth(50.0f);
        Zoo.addAquaticAnimal(dolphin);
        Zoo.addAquaticAnimal(penguin1);
        Zoo.addAquaticAnimal(penguin2);

        Zoo.Swim();

        System.out.println("Max Penguin Swimming Depth: " + Zoo.maxPenguinSwimmingDepth());

        Zoo.displayNumberOfAquaticsByType();

        Aquatic dolphin1 = new Dolphin("Dolphin Family", "Dolphin1", 8, true, "Sea");
        Aquatic dolphin2 = new Dolphin("Dolphin Family", "Dolphin1", 8, true, "Sea");


        if (dolphin1.equals(dolphin2)) {
            System.out.println("The two aquatic animals are identical.");
        } else {
            System.out.println("The two aquatic animals are different.");
        }
    }


}
