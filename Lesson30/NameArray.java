package Lesson30;

public class NameArray {
    public static void main(String[] args) {
        String[] names = {"桜井", "田原", "中川", "鈴木"};
        String search = args[0];
        int i;

        for(i = 0; i < names.length; i++) {
            if(search.equals(names[i])) {
                break;
            }
            if(i < names.length) {
                System.out.println(search + "さんは含まれています。");
            } else {
                System.out.println(search + "さんは含まれていません。");
            }
        }
    }
}
