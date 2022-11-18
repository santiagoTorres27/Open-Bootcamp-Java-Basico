package org.example.section6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Excercise5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        arrayList.add("Item 4");

        LinkedList<String> linkedList = new LinkedList<>();

        for (String i : arrayList) {
            linkedList.add(i);
        }

        System.out.println("Arraylist");
    }

    public static void printList(List list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
