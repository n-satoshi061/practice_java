package Lesson3;
public class Cast {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        double rate = 0.10; // 消費税率: 8%
        int discount, amount;

        if( price >= 5000) {
            discount = 500;
        } else if( price >= 3000) {
            discount = 300;
        } else {
            discount = 0;
        }
        amount = (int)((price - discount) * (1 + rate));
        System.out.println("値引き金額: " + discount + "円");
        System.out.println("合計金額: " + amount + "円");
    }
}
