package Lesson14;

public class Student extends Person {
    private int stuNo;

    public Student(String name, int stuNo) {
        super(name);
        this.stuNo = stuNo;
    }
    public Student(String name) {
        this(name, 999);
    }
    public void display() {
        super.display();
        System.out.println("学籍番号: " + stuNo);
    }
}
