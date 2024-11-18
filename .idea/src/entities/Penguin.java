package entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;


    public Penguin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, isMammal, age, habitat); // Correctly passes parameters to the superclass
        this.swimmingDepth = 15; // Default swimming speed for penguins
    }

    @Override
    public String toString() {
        return "Penguin Name: " + name + ", Family: " + family + ", Is Mammal: " + isMammal + ", Age: " + age + ", Habitat: " + habitat + ", Swimming Depth: " + swimmingDepth + " meters";
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }


}
