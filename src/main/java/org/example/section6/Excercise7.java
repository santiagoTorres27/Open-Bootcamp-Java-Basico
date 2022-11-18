package org.example.section6;

public class Excercise7 {
    public static void main(String[] args) {

        divide(10, 0);
    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        int res = 0;
        try {
            res = num1 / num2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        } finally {
            System.out.println("Demo de código");
        }
        return res;
    }
}
