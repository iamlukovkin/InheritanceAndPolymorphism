package com.task2.structural;

import com.task2.structural.Audio.Genre;

import java.util.Scanner;

public class Inputer {
    private static Scanner scan = null;

    public static Scanner getScanner() {
        if (scan == null) {
            scan = new Scanner(System.in);
            scan.reset();
        }
        return scan;
    }

    public static String readString(String message) {
        String value;
        System.out.println(message);
        Scanner scanner = getScanner();
        value = scanner.nextLine();
        return value;
    }

    public static float readFloat(String message) {
        float value;
        Scanner scanner = getScanner();
        while (true) {
            try {
                System.out.println(message);
                value = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Неверный ввод. Повторите попытку.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static int readInt(String message) {
        int value;
        System.out.println(message);
        Scanner scanner = getScanner();
        while (true) {
            try {
                value = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Неверный ввод. Повторите попытку.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static Genre readGenre() {
        Genre requiredGenre;
        Scanner scanner = getScanner();
        for (Genre genre : Genre.values()) {
            System.out.println(genre.toString());
        }
        System.out.println("Введите жанр: ");
        while (true) {
            try {
                String genre = scanner.next().toUpperCase();
                requiredGenre = Genre.valueOf(genre);
                break;
            } catch (Exception e) {
                System.out.println("Неверный ввод. Повторите попытку.");
                scanner.nextLine();
            }
        }
        return requiredGenre;
    }
}
