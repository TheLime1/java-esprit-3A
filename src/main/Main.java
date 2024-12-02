package main;

import entities.Employe;
import entities.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Mariem", "khalfallah", "aaaa",1 );
        Employe e2 = new Employe(2, "Fatma", "khalfallah", "java", 8);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Rechercher un employé
        System.out.println("\nRecherche d'un employé nommé 'mariem' : " + societe.rechercherEmploye("mariem"));

        // Trier par ID
        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Trier par département et grade
        System.out.println("\nTri par département et grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
