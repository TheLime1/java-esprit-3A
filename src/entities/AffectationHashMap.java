package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations;

    // Constructeur
    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Instruction 2 : Méthode pour ajouter une affectation employé-département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("L'employé " + e.getNom() + " est déjà affecté à un département !");
        } else {
            affectations.put(e, d);
            System.out.println("Affectation réussie : " + e.getNom() + " -> " + d.getNomDepartement());
        }
    }

    // Instruction 3 : Afficher les employés et leurs départements
    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation trouvée.");
            return;
        }
        System.out.println("Liste des affectations (Employé -> Département) :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Instruction 4 : Supprimer un employé de la collection
    public void supprimerEmploye(Employe e) {
        if (affectations.remove(e) != null) {
            System.out.println("L'employé " + e.getNom() + " a été supprimé de la collection.");
        } else {
            System.out.println("L'employé " + e.getNom() + " n'existe pas dans la collection.");
        }
    }

    // Instruction 5 : Supprimer un employé et un département spécifiques
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("L'employé " + e.getNom() + " a été supprimé du département " + d.getNomDepartement());
        } else {
            System.out.println("Aucune correspondance trouvée pour l'employé et le département donnés.");
        }
    }

    // Instruction 6 : Afficher la liste des employés
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7 : Afficher la liste des départements
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    // Instruction 8 : Rechercher un employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Instruction 9 : Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // Instruction 10 : Trier la map par identifiant des employés
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}
