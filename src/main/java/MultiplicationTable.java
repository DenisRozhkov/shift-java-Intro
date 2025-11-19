package main.java;

import java.util.Scanner;

public class MultiplicationTable {
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

    void main() {

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
}
