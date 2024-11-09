package Lesson16;

public class Taxi1 extends Car1 {
    private int price;

    public void start() {
        price = 420;
    }
    public void run() {
        price = price + 80;
    }
    public void display() {
        System.out.println("料金は" + price + "円です。");
    }
}
