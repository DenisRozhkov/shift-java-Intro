package main.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class homework232 {

    public void table(int first_number, int second_number, int step) {
        System.out.print(" " + "\t");
        for (int i = first_number; i <= second_number; i = i + step) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = first_number; i <= second_number; i = i + step) {
            System.out.print(i + "\t");
            for (int j = first_number; j <= second_number; j = j + step) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    public void tableToFile(int first_number, int second_number, int step, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            String header = " \t";
            for (int i = first_number; i <= second_number; i = i + step) {
                header += i + "\t";
            }
            header += "\n";
            fos.write(header.getBytes());

            // Записываем строки с умножением
            for (int i = first_number; i <= second_number; i = i + step) {
                String row = i + "\t";
                for (int j = first_number; j <= second_number; j = j + step) {
                    row += (i * j) + "\t";
                }
                row += "\n";
                fos.write(row.getBytes());
            }

            System.out.println("Таблица умножения успешно записана в файл: " + filename);

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        homework232 app = new homework232();
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

        // Вывод таблицы в консоль
        app.table(first_number, second_number, step);

        // Запись таблицы в файл
        app.tableToFile(first_number, second_number, step, "multiplication_table.txt");
    }
}