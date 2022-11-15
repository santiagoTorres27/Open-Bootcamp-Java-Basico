package org.example.section2;

public class IvaExcerciseMain {
    public static void main(String[] args) {
        double price1 = 50.25;
        System.out.println("Price of " + price1 + " with IVA: " + getPriceWithIva(price1));
    }

    public static double getPriceWithIva(double price) {
        return price + (price * 0.21);
    }
}
