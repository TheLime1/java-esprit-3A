package levels;

import models.Teacher;
import models.Subject;
import utils.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Level3 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        /*
         * TO DO 1: Retourner une chaine de caractère qui contient tous les noms des
         * enseignants en majuscule separés par #
         */
        String names = teachers.stream()
                .map(teacher -> teacher.getName().toUpperCase())
                .reduce((name1, name2) -> name1 + "#" + name2)
                .orElse("");
        System.out.println("Names: " + names);

        /* TO DO 2: Retourner une set d'enseignants Java dont le salaire > 80000 */
        Set<Teacher> teachers1 = teachers.stream()
                .filter(teacher -> teacher.getSubject() == Subject.JAVA && teacher.getSalary() > 80000)
                .collect(Collectors.toSet());
        System.out.println("Java teachers with salary > 80000: " + teachers1);

        /*
         * TO DO 3: Retourner une TreeSet d'enseignants (tri par nom et en cas d'égalité
         * tri par salaire)
         */
        TreeSet<Teacher> teachers2 = teachers.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(
                        (t1, t2) -> {
                            int nameCompare = t1.getName().compareTo(t2.getName());
                            if (nameCompare != 0) {
                                return nameCompare;
                            } else {
                                return Integer.compare(t1.getSalary(), t2.getSalary());
                            }
                        })));
        System.out.println("TreeSet of teachers: " + teachers2);

        /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
        Map<Subject, List<Teacher>> map = teachers.stream()
                .collect(Collectors.groupingBy(Teacher::getSubject));
        System.out.println("Teachers grouped by subject: " + map);

        /*
         * TO DO 5: Retourner une Map qui regroupe les nom des enseignants par salaire
         */
        Map<Integer, String> map1 = teachers.stream()
                .collect(Collectors.toMap(
                        Teacher::getSalary,
                        Teacher::getName,
                        (name1, name2) -> name1 + ", " + name2));
        System.out.println("Teachers' names grouped by salary: " + map1);
    }
}