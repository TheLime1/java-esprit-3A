package levels;

import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Level3 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();


        /* TO DO 1: Retourner une chaine de caractère qui contient tous les noms des enseignants en majuscule separés par # */
        String names = teachers.stream()./* TO DO 1  hint(reduce)*/;

        /* TO DO 2: Retourner une set d'enseignants Java dont le salaire > 80000 */
        Set<Teacher> teachers1 = teachers.stream()./* TO DO 3 */;

        /* TO DO 3: Retourner une TreeSet d'enseignants (tri par nom et en cas d'égalité tri par salaire) */
        TreeSet<Teacher> teachers2 = teachers.stream()./* TO DO 4 */;

        /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
        Map<Integer, List<Teacher>> map = teachers.stream()./* TO DO 5 */;

        /* TO DO 5: Retourner une Map qui regroupe les nom des enseignants par salaire */
        Map<Integer, String> map1 = teachers.stream()./*TO DO 6*/;

        /* TO DO 6: Afficher les nom des enseignants de chaque module */


    }
}
