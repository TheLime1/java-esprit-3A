package main;

import entities.*;
import enums.Food;
import exceptions.InvalidAgeException;
import exceptions.ZooFullException;

public class ZooManagment {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(3);

        try {
            // Création et ajout d'un animal aquatique (Dauphin)
            Aquatic dolphin = new Dolphin("Delphinidae", "Dolly", 5, true, "Ocean");
            zoo.addAnimal(dolphin);
            dolphin.eatMeat(Food.MEAT);

            // Création et ajout d'un pingouin
            Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Arctic");
            zoo.addAnimal(penguin);
            penguin.eatMeat(Food.MEAT);

            // Création et ajout d'un animal terrestre (Omnivore)
            Terrestrial bear = new Terrestrial("Ursidae", "Baloo", 10, true, "Forest");
            zoo.addAnimal(bear);
            bear.eatMeat(Food.MEAT);
            bear.eatPlant(Food.PLANT);
            bear.eatPlantAndMeat(Food.BOTH);

            // Tentative d'ajout d'un animal en dépassant la capacité du zoo
            Aquatic shark = new Aquatic("Carcharhinidae", "Sharky", 7, true, "Sea");
            zoo.addAnimal(shark); // Devrait lever une ZooFullException

        } catch (ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            // Tentative d'ajout d'un animal avec un âge négatif pour tester InvalidAgeException
            Penguin youngPenguin = new Penguin("Spheniscidae", "Tiny", -1, false, "Antarctica");
            zoo.addAnimal(youngPenguin); // Devrait lever une InvalidAgeException
        } catch (ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
