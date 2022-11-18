package org.example.section6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Excercise9 {

    static ArrayList<String> dataArraylist;
    static Scanner sc;
    static boolean running;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        running = true;
        dataArraylist = new ArrayList<>();

        loadFile();
        loadGame();
    }

    private static void loadGame() {
        while (running) {
            printOptions();

            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1:
                        printAllTasks();
                        break;

                    case 2:
                        addNewTask();
                        break;

                    case 3:
                        removeTask();
                        break;

                    case 4:
                        running = false;
                        break;

                    default:
                        System.out.println("The option selected is invalid");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("You can't enter letters");
            }
        }
    }

    private static void loadFile() {
        try {
            InputStream file = new FileInputStream("tasks.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(file), 1);
            String line;

            while ((line = br.readLine()) != null) {
                dataArraylist.add(line);
            }
            file.close();
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exists " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File can't be read " + e.getMessage());
        }
    }

    private static void writeFile() {
        try {
            PrintStream fileOut = new PrintStream("tasks.txt");
            for (String task : dataArraylist) {
                fileOut.println(task);
            }
            fileOut.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void addNewTask() {
        System.out.println("Add the new task: ");
        String task = sc.nextLine();
        dataArraylist.add(task);
        writeFile();
        System.out.println("The new task have been added");
    }

    private static void printAllTasks() {
        System.out.println("** TASKS TO DO **");
        for (int i = 0; i < dataArraylist.size(); i++) {
            System.out.println(i + " - " + dataArraylist.get(i));
        }
    }

    private static void removeTask() {
        try {
            System.out.println("Write the number of the task you want to delete: ");
            int taskId = Integer.parseInt(sc.nextLine());

            if (taskId < 0 || taskId >= dataArraylist.size()) {
                System.out.println("There is no task for the number you have written");
            } else {
                dataArraylist.remove(taskId);
                writeFile();
                System.out.println("The task have been deleted");
            }

        } catch (NumberFormatException e) {
            System.out.println("You can't enter letters");
        }
    }

    public static void printOptions() {
        System.out.println("\n=====================================================");
        System.out.println("1 - Show all tasks to do");
        System.out.println("2 - Add new task");
        System.out.println("3 - Remove an item");
        System.out.println("4 - Exit");
    }
}
