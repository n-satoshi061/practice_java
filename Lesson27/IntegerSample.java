package Lesson27;

public class IntegerSample {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            String s = Integer.toBinaryString(i);
            System.out.println("2進数に変換: " + s);
        } catch (NumberFormatException e) {
            System.out.print(Integer.MIN_VALUE);
            System.out.print("から");
            System.out.print(Integer.MAX_VALUE);
            System.out.print("までの数値を入力してください。");
        }
    }
}
