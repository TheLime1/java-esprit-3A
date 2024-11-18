package entities;

public abstract class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public abstract void makeSound();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }
}
