package levels;

import models.Teacher;
import utils.Data;

import java.util.List;

public class Level1 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        /*
         * TO DO 1: Afficher tous les enseignants
         */
        teachers.stream().forEach(/* TO DO 1 */);

        /*
         * TO DO 2: Afficher les enseignants dont le nom commence par la lettre n
         */
        teachers.stream().filter(/* TO DO 2 */).forEach(/* TO DO 2 */);

        /*
         * TO DO 3: Afficher les enseignants dont le nom commence par la lettre n et le salaire > 100000
         */
        teachers.stream().filter(/* TO DO 3 */).filter(/* TO DO 3 */).forEach(/* TO DO 3 */);

        /*
         * TO DO 4: Afficher les enseignants JAVA triés par salaire (éliminer les redondances)
         */
        teachers.stream().filter(/* TO DO 4 */).sorted(/* TO DO 4 */).forEach(/* TO DO 4 */);

        /*
         * TO DO 5: Afficher les noms des enseignants dont le salaire > 60000 avec 2 manières différentes
         */

        /* First Way */
        teachers.stream().filter(/* TO DO 5 */).forEach(/* TO DO 5 */);
        /* Second Way */
        teachers.stream().filter(/* TO DO 5 */).map(/* TO DO 5 */).forEach(/* TO DO 5 */);

        /*
         * TO DO 6:  Ajouter 200 Dt pour les enseignants dont le nom commence par m et afficher celui qui a le salaire le plus élevé
         */
        teachers.stream().filter(/* TO DO 6 */).peek(/* TO DO 6 */).max(/* TO DO 6 */).ifPresent(/* TO DO 6 */);

    }
}
