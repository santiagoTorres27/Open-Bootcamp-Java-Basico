package org.example.section4;

public class Excercise4Main {
    public static void main(String[] args) {

        SmartDevice phone = new SmartPhone("Apple", "iPhone 13", 2022, 0.200, "iOS 15", 164, 8);
        SmartDevice watch = new SmartWatch("Amazfit", "Bip U Pro", 2022, 0.100, "RTOS", true, true, true);

        System.out.println("Smart phone");
        System.out.println(phone);

        System.out.println("\nSmart watch");
        System.out.println(watch);
    }
}
