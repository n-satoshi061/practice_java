package Lesson28;

import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("私は");
        list.add("Javaを");
        list.add("勉強しています。");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
