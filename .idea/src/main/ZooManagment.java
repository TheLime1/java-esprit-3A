package main;

import entities.Animal;
import entities.Zoo;
import exceptions.ZooFullException;
import exceptions.InvalidAgeException;

public class ZooManagment {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(3);

        try {
            zoo.addAnimal(new Animal("Lion", "Simba", 5, true));
            zoo.addAnimal(new Animal("Elephant", "Dumbo", 2, false));
            zoo.addAnimal(new Animal("Penguin", "Pingu", -3, false)); // Test avec un âge négatif
            zoo.addAnimal(new Animal("Tiger", "Shere Khan", 4, true)); // Dépasse la capacité
        } catch (ZooFullException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
