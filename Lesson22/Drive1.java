package Lesson22;

public class Drive1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("計算開始");
        System.out.println("a / b = " + (a / b) + " あまり " + (a % b));
        System.out.println("計算終了");
    }
}
