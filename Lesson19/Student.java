package Lesson19;

public class Student implements Englishable {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("名前: " + name);
    }
    public void displayEng() {
        System.out.println(Englishable.LANGUAGE);
        System.out.println("Name: " + name);
    }
}
