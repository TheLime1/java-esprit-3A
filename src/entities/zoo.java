package entities;

import exceptions.ZooFullException;
import exceptions.InvalidAgeException;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private int capacity;

    public Zoo(int capacity) {
        this.capacity = capacity;
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        if (animals.size() >= capacity) {
            throw new ZooFullException("Zoo is full. Cannot add more animals.");
        }
        animals.add(animal);
        System.out.println("Animal added: " + animal.getName());
        System.out.println("Total animals: " + animals.size());
    }
}
