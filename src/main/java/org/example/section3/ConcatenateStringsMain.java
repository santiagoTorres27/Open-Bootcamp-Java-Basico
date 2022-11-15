package org.example.section3;

public class ConcatenateStringsMain {
    public static void main(String[] args) {
        String[] names = {"Santiago", "Alejandra", "Jorge", "Clara"};
        System.out.println(concatenateStrings(names));
    }

    public static String concatenateStrings(String[] arr) {
        String res = "";
        for (String text : arr) {
            res += text + " ";
        }
        return res;
    }
}
