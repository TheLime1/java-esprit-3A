package entities;

public class Dolphin extends Aquatic {
    public float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, isMammal, age, habitat); // Corrected the order of parameters
        this.swimmingSpeed = 22; // Default swimming speed
    }

    @Override
    public String toString() {
        return "Dolphin Name: " + name + ", Family: " + family + ", Is Mammal: " + isMammal + ", Age: " + age + ", Habitat: " + habitat + ", Swimming Speed: " + swimmingSpeed + " km/h";
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
