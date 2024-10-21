package gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {}

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
}

