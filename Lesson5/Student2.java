package Lesson5;
public class Student2 {
    String name;
    int engScore;
    int mathScore;

    void setData(String n) {
        name = n;
    }
    void setData(String n, int e, int m) {
        name = n;
        engScore = e;
        mathScore = m;
    }
    void setScore(int e, int m) {
        engScore = e;
        mathScore = m;
    }
    void display() {
        System.out.println(name + "さんの英語の点数は" + engScore + "点、数学の点数は" + mathScore + "点です。");
    }
}
