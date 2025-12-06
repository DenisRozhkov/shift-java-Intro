package main.java;

import java.util.Scanner;

public class SymbolReplacement {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную строку: ");
        String string = scanner.nextLine();
        System.out.print("Введите символ: ");
        String symbol = scanner.nextLine();
        String modifiedString;
        modifiedString = string.replace("  ", " ");
        modifiedString = modifiedString.replace(symbol, " ");
        modifiedString = modifiedString.replace("  ", " ");
        String finalString = string + modifiedString;
        System.out.print(finalString);
        if (string.equals(modifiedString)) {
            System.out.println("\nСтрока не изменена");
        }
    }
}

