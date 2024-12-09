package main;

import entities.Student;
import entities.StudentManagement;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Initialisation des données
        StudentManagement management = new StudentManagement();
        List<Student> students = Arrays.asList(
                new Student(1, "Mariem", 18),
                new Student(2, "Wissal", 24),
                new Student(3, "Emna", 23)
        );

        // Afficher tous les étudiants
        System.out.println("Affichage des étudiants :");
        management.displayStudents(students, System.out::println);

        // Afficher les étudiants ayant plus de 20 ans
        System.out.println("\nÉtudiants ayant plus de 20 ans :");
        management.displayStudentsByFilter(
                students,
                student -> student.getAge() > 20,
                System.out::println
        );

        // Retourner les noms des étudiants
        String names = management.returnStudentsNames(students, Student::getName);
        System.out.println("\nNoms des étudiants : " + names);

        // Créer un nouvel étudiant
        Student newStudent = management.createStudent(() -> new Student(4, "fatma", 23));
        System.out.println("\nNouvel étudiant créé : " + newStudent);

        // Trier les étudiants par ID
        List<Student> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Student::getId));
        System.out.println("\nÉtudiants triés par ID :");
        sortedStudents.forEach(System.out::println);

        // Convertir en Stream et afficher
        System.out.println("\nConversion en Stream et affichage :");
        management.convertToStream(students).forEach(System.out::println);
    }
}
