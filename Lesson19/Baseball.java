package Lesson19;

public class Baseball implements Englishable {
    public void display() {
        System.out.println("キャッチボール");
        System.out.println("シートノック");
        System.out.println("バッティング");
    }

    public void displayEng() {
        System.out.println(Englishable.LANGUAGE);
        System.out.println("catch ball");
        System.out.println("batting practice");
    }
}
