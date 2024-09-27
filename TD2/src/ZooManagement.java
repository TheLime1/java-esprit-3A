import java.util.Scanner;

public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = scanner.nextLine();

        while (true) {
            System.out.print("Entrez le nombre de cages : ");
            if (scanner.hasNextInt()) {
                zoo.nbrCages = scanner.nextInt();
                break;
            } else {
                System.out.println("Veuillez entrer un nombre entier valide.");
                scanner.next();
            }
        }

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
    }
}