package entities;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        if (!departements.add(d)) {
            System.out.println("Le département existe déjà !");
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (!departements.remove(d)) {
            System.out.println("Le département n'existe pas !");
        }
    }

    @Override
    public void displayDepartement() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedDepartements = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedDepartements.addAll(departements);
        return sortedDepartements;
    }
}
