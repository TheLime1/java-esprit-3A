package entities;

public class Dolphin extends Aquatic {
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
    }

    @Override
    public void makeSound() {
        System.out.println("Dolphin sound!");
    }
}
