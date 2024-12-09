package entities;

import java.util.Objects;

public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String grade;
    private Departement departement;

    // Constructeur
    public Employe(int id, String nom, String prenom, String grade, Departement departement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.departement = departement;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    // Méthode pour obtenir le nom du département
    public String getNomDepartement() {
        return departement != null ? departement.getNomDepartement() : "Aucun département";
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", grade='" + grade + '\'' +
                ", departement=" + (departement != null ? departement.getNomDepartement() : "Aucun département") +
                '}';
    }

    // Méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom) && Objects.equals(prenom, employe.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom);
    }
}
