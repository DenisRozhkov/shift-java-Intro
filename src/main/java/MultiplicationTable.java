package main.java;

import java.util.Scanner;

public class MultiplicationTable {

    public static void table(int first_number, int second_number, int step) {
        int columnWidth = getCellWidth(second_number * second_number) + 2;
        System.out.printf("%" + columnWidth + "s", "");
        for (int i = first_number; i <= second_number; i = i + step) {
            System.out.printf("%" + columnWidth + "s", i);
        }
        if (second_number - first_number % step != 0) {
            System.out.printf("%" + columnWidth + "s", second_number);
        }
        System.out.println();

        for (int i = first_number; i <= second_number; i = i + step) {
            System.out.printf("%" + columnWidth + "s", i);
            for (int j = first_number; j <= second_number; j = j + step) {
                System.out.printf("%" + columnWidth + "s", (i * j));
            }
            if (second_number - first_number % step != 0) {
                System.out.printf("%" + columnWidth + "s", (i * second_number));
            }
            System.out.println();
        }
        if (second_number - first_number % step != 0) {
            System.out.printf("%" + columnWidth + "s", second_number);
            for (int j = first_number; j <= second_number; j = j + step) {
                System.out.printf("%" + columnWidth + "s", (second_number * j));
            }
            System.out.printf("%" + columnWidth + "s", (second_number * second_number));
            System.out.println();
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
        table(first_number, second_number, step);
    }

    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }
}