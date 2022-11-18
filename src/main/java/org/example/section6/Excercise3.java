package org.example.section6;

import java.util.Vector;

public class Excercise3 {
    public static void main(String[] args) {

        Vector<String> myVector = new Vector<>();
        myVector.add("Item 1");
        myVector.add("Item 2");
        myVector.add("Item 3");
        myVector.add("Item 4");
        myVector.add("Item 5");

        System.out.println("Vector before deleting");
        printVector(myVector);

        myVector.remove(1);
        myVector.remove(2);
        System.out.println("\nVector after deleting");
        printVector(myVector);
    }

    public static void printVector(Vector<String> myVector) {
        for (String i : myVector) {
            System.out.println(i);
        }
    }
}
