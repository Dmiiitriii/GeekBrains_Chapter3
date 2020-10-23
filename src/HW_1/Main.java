package HW_1;

import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;



public class Main {


    public static void main(String[] args) {


        BoxGen<? extends Number> BoxApple = new BoxGen<>(10, "apple");
        BoxGen<? extends Number> BoxOrange = new BoxGen<>(10, "orange");

        Apple[] apples = {
                new Apple(1.0f),
                new Apple(1.0f),
                new Apple(1.0f),
                new Apple(1.0f),
                new Apple(1.0f)
        };
        Orange[] oranges = {
                new Orange(1.5f),
                new Orange(1.5f),
                new Orange(1.5f),
                new Orange(1.5f)
        };

        getApplesInbox(apples);
        getOrangesInbox(oranges);

// создание коллекции
        int countElements = 5;
        LinkedList<String> changeableList = new LinkedList();
        for (int i = 0; i < countElements; i++) {
            changeableList.add("A" + i);
        }
        System.out.println(changeableList);

        String [] arr = {"1","2","3,4","5,6","7"};

        changeArray(0, 4, arr);

        linkedListToArrayList(changeableList);
    }
//метод для перестановки элементов
    public static <T> void changeArray(int element1, int element2, T [] list) {

        T change1 = list[element1];
        T change2 = list[element2];;
        list[element1] =change2;
        list[element2] =change1;
        System.out.println(Arrays.toString(list));
    }
//метод для преобразования LinkedList в ArrayList
    public static  void  linkedListToArrayList(LinkedList<String> changeableList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < changeableList.size(); i++) {
            arrayList.add(i, changeableList.get(i));
        }
        System.out.println("ArrayList: " + "\n" + arrayList);

    }
    public static void getApplesInbox(Apple apples[]) {
        LinkedList applesInBox = new LinkedList();
        for (Apple i : apples) {
            applesInBox.add(i);
        }

        System.out.println(applesInBox);
    }

    public static void getOrangesInbox(Orange oranges[]) {
        LinkedList orangesInBox = new LinkedList();
        for (Orange i : oranges) {
            orangesInBox.add(i);
        }

    }


}
