package entities;

public class Terrestrial extends Animal {
    public int nbrLegs;


    public Terrestrial(String family, int age, String name, boolean isMammal, int nbrLegs) {
        super(family, name, isMammal, age);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial Name: " + name + ", Family: " + family + ", Is Mammal: " + isMammal + ", Age: " + age + ", Number of Legs: " + nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}
