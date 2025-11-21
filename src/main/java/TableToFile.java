package main.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TableToFile {

    public static void tableToFile(int first_number, int second_number, int step) {
        try (FileOutputStream fos = new FileOutputStream("table_output.txt")) {
            int columnWidth = getCellWidth(second_number * second_number) + 2;
            writeToFile(fos, String.format("%" + columnWidth + "s", ""));
            for (int i = first_number; i <= second_number; i = i + step) {
                writeToFile(fos, String.format("%" + columnWidth + "s", i));
            }
            if (second_number - first_number % step != 0) {
                writeToFile(fos, String.format("%" + columnWidth + "s", second_number));
            }
            writeToFile(fos, System.lineSeparator());
            for (int i = first_number; i <= second_number; i = i + step) {
                writeToFile(fos, String.format("%" + columnWidth + "s", i));
                for (int j = first_number; j <= second_number; j = j + step) {
                    writeToFile(fos, String.format("%" + columnWidth + "s", (i * j)));
                }
                if (second_number - first_number % step != 0) {
                    writeToFile(fos, String.format("%" + columnWidth + "s", (i * second_number)));
                }
                writeToFile(fos, System.lineSeparator());
            }
            if (second_number - first_number % step != 0) {
                writeToFile(fos, String.format("%" + columnWidth + "s", second_number));
                for (int j = first_number; j <= second_number; j = j + step) {
                    writeToFile(fos, String.format("%" + columnWidth + "s", (second_number * j)));
                }
                writeToFile(fos, String.format("%" + columnWidth + "s", (second_number * second_number)));
                writeToFile(fos, System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_number;
        System.out.print("Введите первое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число.");
            System.out.print("Попробуйте снова: ");
            scanner.next();
        }
        first_number = scanner.nextInt();
        int second_number;
        System.out.print("Введите второе число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число.");
            System.out.print("Попробуйте снова: ");
            scanner.next();
        }
        second_number = scanner.nextInt();
        int step;
        System.out.print("Введите шаг: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число.");
            System.out.print("Попробуйте снова: ");
            scanner.next();
        }
        step = scanner.nextInt();
        scanner.close();
        tableToFile(first_number, second_number, step);
    }

    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }

    private static void writeToFile(FileOutputStream fos, String text) throws IOException {
        fos.write(text.getBytes());
    }
}