package tn.esprit.main;

import tn.esprit.entities.Animal;
import tn.esprit.entities.Zoo;

public class Zoomanagement {

                public static void main(String[] args) {
                        Animal lion = new Animal();
                        lion.setName("Simba");
                        lion.setAge(8);
                        lion.setFamily("Cats");
                        lion.setMammal(true);

                        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
                        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


                        Animal dog = new Animal("Canine", "Snoopy", 2, true);


                        System.out.println(myZoo.addAnimal(lion));
                        System.out.println(myZoo.addAnimal(dog));

                        myZoo.displayAnimals();

                        System.out.println(myZoo.searchAnimal(dog));
                        Animal dog2 = new Animal("Canine", "lll", 2, true);
                        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
                        myZoo.displayAnimals();


                        System.out.println(myZoo);

                        myZoo.addAnimal(lion);
                        myZoo.addAnimal(dog);
                        myZoo.addAnimal(dog2);
                        myZoo.displayAnimals();


                        myZoo.setName("Belvedere Park");
                        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
                        System.out.println(notMyZoo1);

                }

}