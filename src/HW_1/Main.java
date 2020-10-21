package HW_1;

import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        int countElements = 5;
        LinkedList<String> changeableList = new LinkedList();
        for (int i = 0; i < countElements; i++) {
            changeableList.add("A" + i);
        }
        System.out.println(changeableList);

        changeArray(0, 4, changeableList);

        linkedListToArrayList(changeableList);
    }

    public static void changeArray(int element1, int element2, LinkedList<String> changeableList) {

        String change1 = changeableList.get(element1);
        String change2 = changeableList.get(element2);
        changeableList.set(element1, change2);
        changeableList.set(element2, change1);
        System.out.println(changeableList);
    }

    public static void linkedListToArrayList(LinkedList<String> changeableList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < changeableList.size(); i++) {
            arrayList.add(i, changeableList.get(i));
        }
        System.out.println(arrayList);

    }


}
