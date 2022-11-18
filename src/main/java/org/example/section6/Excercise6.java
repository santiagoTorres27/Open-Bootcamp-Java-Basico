package org.example.section6;

import java.util.ArrayList;

public class Excercise6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }

        for (Integer num : arrayList) {
            System.out.println(num);
        }

    }
}
