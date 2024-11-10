package Lesson24;

public class TryDivide {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
    
            System.out.println("計算開始");
            System.out.println("a / b = " + (a / b) + " あまり " + (a % b));
            System.out.println("計算終了");
        } catch(NumberFormatException e) {
            System.out.println("数値を入力してください");
            e.printStackTrace();
        } catch(ArithmeticException e) {
            System.out.println("割る数は0以外を入力してください");  
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("例外が発生しました");
            System.out.println("詳細: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("プログラムを終了します");
        }
    }
}
