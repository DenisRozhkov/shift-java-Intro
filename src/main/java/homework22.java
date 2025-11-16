package main.java;

import java.util.Scanner;

public class homework22 {
    public void table(int first_numb, int second_numb, int shag) {
        System.out.print(" " + "\t");
        for (int i = first_numb; i <= second_numb; i = i + shag) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = first_numb; i <= second_numb; i = i + shag) {
            System.out.print(i + "\t");
            for (int j = first_numb; j <= second_numb; j = j + shag) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    void main() {

        Scanner scanner = new Scanner(System.in);

        int first_numb;

        System.out.print("Введите первое число: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число.");
            System.out.print("Попробуйте снова: ");
            scanner.next();
        }

        first_numb = scanner.nextInt();

        int second_numb;

        System.out.print("Введите второе число: ");


        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число.");
            System.out.print("Попробуйте снова: ");
            scanner.next();
        }

        second_numb = scanner.nextInt();

        int shag;

        System.out.print("Введите шаг: ");


        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число.");
            System.out.print("Попробуйте снова: ");
            scanner.next();
        }

        shag = scanner.nextInt();

        scanner.close();
        table(first_numb, second_numb, shag);
    }
}
