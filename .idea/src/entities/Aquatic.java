package entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, int age, String name, boolean isMammal, String habitat) {
        super(family, name, isMammal, age);
        this.habitat = habitat;
    }

    public Aquatic() {
        super();
    }

    @Override
    public String toString() {
        return "Aquatic Name: " + name + ", Family: " + family + ", Is Mammal: " + isMammal + ", Age: " + age + ", Habitat: " + habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic other = (Aquatic) obj;

        if (name == null || habitat == null) {
            return false;
        }

        return name.equals(other.name) && age == other.age && habitat.equals(other.habitat);
    }

    @Override
    public int hashCode() {
        int result = (name != null) ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + ((habitat != null) ? habitat.hashCode() : 0);
        return result;
    }
}
