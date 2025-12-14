package main.java;

import java.util.Scanner;

public class SymbolReplacement {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Введите исходную строку (минимум 2 символа): ");
            string = scanner.nextLine();

            if (string != null && string.length() > 1) {
                isValid = true;
            } else {
                System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
        String symbol = "";
        boolean isValid1 = false;

        while (!isValid1) {
            System.out.print("Введите один символ (не пробел): ");
            symbol = scanner.nextLine();

            if (symbol.length() == 1 && !Character.isWhitespace(symbol.charAt(0))) {
                isValid1 = true;
            } else {
                System.out.println("Неверный ввод. Введите ровно один непробельный символ.");
            }
        }
        String modifiedString;
        modifiedString = string.replaceAll("\\s+", " ");
        modifiedString = modifiedString.replace(symbol, " ");
        modifiedString = modifiedString.replace("  ", " ");
        String finalString = string + "\n" + modifiedString;
        System.out.print(finalString);
        if (string.equals(modifiedString)) {
            System.out.println("\nСтрока не изменена");
        }
    }
}

