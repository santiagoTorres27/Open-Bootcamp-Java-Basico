package org.example.section6;

import java.io.*;

public class Excercise8 {
    public static void main(String[] args) {
        copyFile("file.txt", "file2.txt");
    }

    public static void copyFile(String pathFileIn, String pathFileOut) {
        try {
            InputStream file = new FileInputStream(pathFileIn);
            byte[] data = file.readAllBytes();
            file.close();

            PrintStream fileOut = new PrintStream(pathFileOut);
            fileOut.write(data);
            fileOut.close();

        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exists " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Reading error " + e.getMessage());
        }
    }

}
