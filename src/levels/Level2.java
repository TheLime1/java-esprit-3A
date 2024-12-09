package levels;

import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import models.Subject;

public class Level2 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        /* TO DO 1: Retourner le nombre des enseignants dont le nom commence avec s */
        long nbr = teachers.stream()
                .filter(teacher -> teacher.getName().startsWith("s"))
                .count();
        System.out.println("Number of teachers whose name starts with 's': " + nbr);

        /*
         * TO DO 2: Retourner la somme des salaires de tous les enseignants Flutter
         * (hint: mapToInt)
         */
        long sum = teachers.stream()
                .filter(teacher -> teacher.getSubject() == Subject.FLUTTER)
                .mapToInt(Teacher::getSalary)
                .sum();
        System.out.println("Sum of salaries of Flutter teachers: " + sum);

        /*
         * TO DO 3: Retourner la moyenne des salaires des enseignants dont le nom
         * commence avec a
         */
        double average = teachers.stream()
                .filter(teacher -> teacher.getName().startsWith("a"))
                .mapToInt(Teacher::getSalary)
                .average()
                .orElse(0);
        System.out.println("Average salary of teachers whose name starts with 'a': " + average);

        /* TO DO 4: Retourner la liste des enseignants dont le nom commence par f */
        List<Teacher> teachers1 = teachers.stream()
                .filter(teacher -> teacher.getName().startsWith("f"))
                .collect(Collectors.toList());
        System.out.println("Teachers whose name starts with 'f': " + teachers1);

        /* TO DO 5: Retourner la liste des enseignants dont le nom commence par s */
        List<Teacher> teachers2 = teachers.stream()
                .filter(teacher -> teacher.getName().startsWith("s"))
                .collect(Collectors.toList());
        System.out.println("Teachers whose name starts with 's': " + teachers2);

        /*
         * TO DO 5: Retourner true si il y a au min un enseignants dont le salaire >
         * 100000, false si non
         */
        boolean test = teachers.stream()
                .anyMatch(teacher -> teacher.getSalary() > 100000);
        System.out.println("Is there any teacher with salary > 100000: " + test);

        /*
         * TO DO 6: Afficher le premier enseignant Unity le nom commence avec g avec 2
         * manières différentes
         */
        /* First way */
        Optional<Teacher> firstTeacher1 = teachers.stream()
                .filter(teacher -> teacher.getSubject() == Subject.UNITY && teacher.getName().startsWith("g"))
                .findFirst();
        firstTeacher1.ifPresent(teacher -> System.out
                .println("First Unity teacher whose name starts with 'g' (first way): " + teacher));

        /* Second way */
        Teacher firstTeacher2 = teachers.stream()
                .filter(teacher -> teacher.getSubject() == Subject.UNITY && teacher.getName().startsWith("g"))
                .collect(Collectors.toList())
                .stream()
                .findFirst()
                .orElse(null);
        System.out.println("First Unity teacher whose name starts with 'g' (second way): " + firstTeacher2);

        /* TO DO 7: Afficher le deuxième enseignant dont le nom commence avec s */
        Teacher secondTeacher = teachers.stream()
                .filter(teacher -> teacher.getName().startsWith("s"))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second teacher whose name starts with 's': " + secondTeacher);
    }
}