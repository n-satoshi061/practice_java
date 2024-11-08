package Lesson8;
public class StuSample5 {
    public static void main(String[] args) {
        Student5 stu1 = new Student5("西川");
        stu1.setScore(80);
        stu1.display();

        Student5 stu2 = new Student5("塚田");
        stu2.setScore(-50);
        // stu2.score = -50;
        stu2.display();
    }
}
