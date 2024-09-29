public class Animal {
    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    public Animal() {
        family = "";
        name = "";
        age = 0;
        isMammal = false;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
public String toString() {
        return "Name: "+name+ ",age:"+age+" , isMammal:"+isMammal;
}

}
