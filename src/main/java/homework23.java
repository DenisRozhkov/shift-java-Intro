package main.java;

import java.util.Scanner;

public class homework23 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную строку: ");
        String string = scanner.nextLine();
        System.out.print("Введите символ: ");
        String symbol = scanner.nextLine();
String modifiedString ;
        modifiedString = string.replace("  " , " ");
        modifiedString =modifiedString.replace(symbol , " ");
        modifiedString = modifiedString.replace("  " , " ");
        String finalString = string + modifiedString;
        System.out.print(finalString);
        if (string.equals(modifiedString)) {
            System.out.println("\nСтрока не изменена");
        }

       /* System.out.println(string.replace("  " , " "));
        System.out.println(string.replace(symbol , " "));
        System.out.println(string.replace("  " , " "));*/
    }
}

