public class MainClass {
    public static void main(String[] args) {
        Animal lion = new Animal("Carnivore", "Lion", 5, true);
        Animal chat = new Animal("Carnivore", "Chat", 2,true);
        Animal cheval = new Animal("Herbivore", "Cheval", 6,true);
        System.out.println(lion.family);
        System.out.println(lion.age);

        Zoo myzoo = new Zoo("belvedere","tunis",25);
        Zoo zoo = new Zoo("frigya","tunis",25);

        myzoo.dispalyZoo();
        System.out.println(lion.toString());
        System.out.println(myzoo.toString());
        myzoo.addAnimal(lion);
        myzoo.addAnimal(chat);
        myzoo.addAnimal(cheval);
        myzoo.addAnimal(cheval);
        System.out.println(myzoo.toString());
        myzoo.removeAnimal(lion);
        System.out.println(myzoo.toString());
        zoo.addAnimal(lion);
        zoo.addAnimal(chat);
        zoo.addAnimal(cheval);
        System.out.println(zoo.toString());
        System.out.println(Zoo.com(myzoo,zoo));
        System.out.println(myzoo.isZooFull(myzoo));
    }
}
