package entities;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    // Afficher tous les étudiants avec un Consumer
    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        students.forEach(con);
    }

    // Afficher les étudiants selon un filtre avec un Predicate
    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        students.stream()
                .filter(pre)
                .forEach(con);
    }

    // Retourner les noms des étudiants sous forme d'une chaîne avec un Function
    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        return students.stream()
                .map(fun)
                .collect(Collectors.joining(", "));
    }

    // Créer un étudiant avec un Supplier
    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    // Trier les étudiants par ID avec un Comparator
    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        return students.stream()
                .sorted(com)
                .collect(Collectors.toList());
    }

    // Convertir la liste d'étudiants en un Stream
    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}
