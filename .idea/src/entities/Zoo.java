package entities;

import exceptions.ZooFullException;
import exceptions.InvalidAgeException;

public class Zoo {
    private Animal[] animals;
    private int capacity;
    private int count;

    public Zoo(int capacity) {
        this.capacity = capacity;
        animals = new Animal[capacity];
        count = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (count >= capacity) {
            throw new ZooFullException("The zoo is full. Cannot add more animals.");
        }

        if (animal.getAge() < 0) {
            throw new InvalidAgeException("The animal's age cannot be negative.");
        }

        animals[count++] = animal;
        System.out.println("Animal added: " + animal);
        System.out.println("Total animals: " + count);
    }
}
