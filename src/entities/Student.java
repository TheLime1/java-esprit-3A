package entities;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructeurs
    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}
