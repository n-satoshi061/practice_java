package Lesson15;

public class StuSample {
    public static void main(String[] args) {
        final int BASE_NO = 1000;
        Student stu1 = new Student("西川", BASE_NO + 1);
        stu1.display();
        Student stu2 = new Student("塚田", BASE_NO + 2);
        stu2.display();
        // BASE_NO = 2000; // コンパイルエラー
    }
}
