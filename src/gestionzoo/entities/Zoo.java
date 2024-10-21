package gestionzoo.entities;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages = 25;
    private Animal[] animals;
    private int animalCount = 0;


    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
        this.name = name;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Cannot add animal. The zoo is full.");
            return false;
        }

        if (searchAnimal(animal.getName()) != -1) {
            System.out.println("Animal already exists in the zoo.");
            return false;
        }

        animals[animalCount++] = animal;
        return true;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
        } else {
            System.out.println("Cannot add more aquatic animals. The limit is reached.");
        }
    }

    public void displayAquaticAnimalsSwim() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();  // Calls the swim method of each aquatic animal
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                maxDepth = Math.max(maxDepth, ((Penguin) aquatic).getSwimmingDepth());
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void displayZoo() {
        System.out.println("Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}");
    }
}
