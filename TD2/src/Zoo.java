import java.sql.SQLOutput;

public class Zoo {
    public String name;
    public String city;
    final int NB_CAGES = 25;
    public Animal[] animals;

    public int nbAnimals;

    public Zoo() {
        name = "";
        city = "";

        animals = new Animal[25];
    }

    public Zoo(String name, String city, int nbCage) {
        this.name = name;
        this.city = city;


        animals = new Animal[NB_CAGES];
        System.out.println("--->" + this.animals.length);
    }

    public void dispalyZoo() {
        System.out.println(name);
        System.out.println(city);
        System.out.println(NB_CAGES);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }

        }
    }

    public String toString() {
        String ch1 = "", ch2 = "";
        ch1 = "Name: " + name + ", city:" + city +
                ", nbr cages:" + NB_CAGES + ", nb animals:" + nbAnimals + "\n";
        for (int i = 0; i < nbAnimals; i++) {
            ch2 += animals[i].toString() + "\n";
        }
        return ch1 + ch2;
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) == -1) {
            if (nbAnimals < 25) {
                animals[nbAnimals] = animal;
                nbAnimals++;
                return true;
            } else {
                System.out.println("Error: Can't add animal to Zoo");
                return false;
            }
        } else {
            System.out.println("animal exxitant");
            return false;
        }

    }

    public int searchAnimal(Animal animal) {
        //int pos=-1;
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int pos = searchAnimal(animal);
        if (pos != -1) {
            for (int i = pos; i < nbAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbAnimals - 1] = null;
            nbAnimals--;
            return true;
        }
        return false;
    }

    public static Zoo com(Zoo Z1, Zoo Z2) {
        if (Z1.nbAnimals > Z2.nbAnimals) {
            System.out.println("z1 est olus grand");
            return Z1;
        } else if (Z1.nbAnimals < Z2.nbAnimals) {
            System.out.println("z2 est olus grand");
            return Z2;
        } else {
            System.out.println("les deux zoo ont le meme nombre danimaux");
        }
        return null;
    }
public boolean  isZooFull (Zoo zoo) {
    if(zoo.nbAnimals >= NB_CAGES) {

        System.out.println("le zoo est plein");
        return true;
    }
   else
    { System.out.println("le zoo n' est pas plein");
        return false;
    }
}


    }




