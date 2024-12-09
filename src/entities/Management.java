package entities;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public interface Management {
    void displayStudents(List<Student> students, Consumer<Student> con);

    void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con);

    String returnStudentsNames(List<Student> students, Function<Student, String> fun);

    Student createStudent(Supplier<Student> sup);

    List<Student> sortStudentsById(List<Student> students, Comparator<Student> com);

    Stream<Student> convertToStream(List<Student> students);
}
